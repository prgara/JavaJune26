package aug15;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        try {
            System.out.println(arr[5]);
            System.out.println(new String((String) null).toLowerCase());
            System.out.println(10 / 0);
        }catch (NumberFormatException e){
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed");
        }


        try {

        } finally {
            System.out.println();
        }


//        System.out.println(10/0);
//        String s = null;
//        System.out.println(s.toLowerCase());
        System.out.println("Program ended here");

        Scanner scanner = new Scanner(System.in);
        scanner.close();

        try( Scanner sc = new Scanner(System.in)){
            int i = sc.nextInt();
            System.out.println(i);

        }



    }
}
