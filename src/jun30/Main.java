package jun30;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a num: ");
        int i = scanner.nextInt();

        System.out.println("Enter your name: ");
        String next = scanner.next();
        System.out.println("Name is :" + next);


        System.out.println("User input is :" + i);
    }
}
