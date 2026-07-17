package jul14;

public class Employee {

    String name;
    int id;
    double salary;
    int a, b;

    // method w/o parameter
    void printDetails() {
        System.out.println("Employee name is : " + name);
        System.out.println("Employee id is : " + id);
        System.out.println("Employee salary is : " + salary);
    }

    //method with parameters
//    void sum(int a, int b) {
//        System.out.println(a + b);
//    }


    //method with return type
    int sum(int a, int b) {
        return a+b;
    }
}


