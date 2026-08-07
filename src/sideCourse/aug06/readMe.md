what happens after you push the code to github ?
deploy 
github   ----------------------------              pragra.com
CICD pipeline

jar -> java archive
Maven is a build automation tool


java classes ----- jar ---- deployed on server

javac abc.java ---- compile the class
java abc.java ----- execute the java file


jar ----- 


CICD
Continuous Integration -> it is a practice of merging all the dev changes into a shared repo, with each change triggers build and testing.
- dev pushes the code to Github
- CI server will detect the push
- Code is automatically build or compiled
- test cases will run automatically
Continuous Deployment - every change that pass all the test is automatically released to production. no human intervention
Continuous delivery - Code is ready to release at any time. Human will click a button to make the code live.

Code ---  push ---  build --- Test --- package --- deploy --- monitor
Environments -- staging, dev, QA, UAT, prod, cob


CI/CD Tools
- Jenkins
- github actions
- CircleCI
- Gitlab CI/CD

Jenkins -- It is a open source automation sever that lets you build, test and deploy software automatically. 

master-agent architecture for jenkin

Deployment strategy
- Blue-Green deployment : Maintains 2 identical prod env. Traffic switches fast and rollback is very easy. infrastructure cost is double.
- Canary deployment : 
- Rolling deployment : 



