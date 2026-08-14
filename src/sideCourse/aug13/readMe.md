code push -- jenkins --- build maven --- copy jar --- ec2 --- live app



pipeline {
agent any

    stages {
        stage('Checkout') {
            steps {
                git(
                    branch: 'main',
                    url: 'https://github.com/prgara/Jenkins-aws.git'
                    )
            }
        }
        stage('Build') {
            steps {
               sh 'java -version'
                sh 'mvn -version'
                sh 'mvn clean package -DskipTest'
            }
        }
        stage('Deployment to EC2 server') {
            steps {
                sshPublisher(
                    publishers:[
                        sshPublisherDesc(
                            configName: 'EC2',
                            transfers:[
                                sshTransfer(
                                    sourceFiles: 'target/*.jar',
                                    removePrefix: 'target',
                                    remoteDirectory: 'app',
                                    excecCommand: '''
                                        mkdir -p ~/app
                                        pkill -f "java -jar" || true
                                        sleep 5
                                        nohup java -jar  ~/app/*.jar > ~/app/log.txt 2>&1 &
                                        sleep 5
                                        ps -ef | grep java | grep -v grep
                                    '''
                                    )
                                ], verbose: true
                            )
                        ]
                    )
            }
        }
    }
       post {
           success {
               echo 'Apliication deployed successfuly'
           }
           failure {
            echo 'Deployment failed'
           }
           }
       }
