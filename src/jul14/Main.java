package jul14;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.name = "John";
        emp.id = 101;
        emp.salary = 1000000.00;

        emp.printDetails();
        int sum = emp.sum(3, 89);
        System.out.println(sum);

    }


}
