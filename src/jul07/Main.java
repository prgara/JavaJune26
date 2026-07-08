package jul07;

public class Main {


    public static void main(String[] args) {

        int i = 10;

        while ( i <= 1){
//            System.out.println(i);
            i--;
        }

        do {
//            System.out.println("Hello");
            i--;
        } while (i >=5);

        int num = 7849895;
        int sum = 0;
        do{
           sum = sum + num % 10; // gets the last digit & adding to sum
           num = num /10; // remove the last digit
        } while (num > 0);

        System.out.println(sum);


        for(int j = 1; j <= 10; j++ ){
            System.out.print(j + " ");
        }

    }
}



