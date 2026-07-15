package jul11;

public class StudentMain {
    public static void main(String[] args) {


        Student palak = new Student();
        palak.age = 25;
        palak.name = "Palak";


        Student jashan = new Student();
        jashan.name = "Jashan";
        jashan.age = 27;

        System.out.println("Student 1 age is : "+palak.age);
        System.out.println("Student 1 name is: " +palak.name);
        System.out.println("Student 2 age is : "+jashan.age);
        System.out.println("Student 2 name is: " +jashan.name);

    }
}
