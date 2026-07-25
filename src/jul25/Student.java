package jul25;

public class Student {
    String name;
    int rollNo;
    static String schoolName = "Delhi public School";


   static {
        System.out.println("static block called");
    }

    {
        System.out.println("Instance block called");
    }

    public Student() {
        System.out.println("Student Constructor called");
    }

    void printStudentDeatils(){
       System.out.println("Student name is :" + name);
    }
}
