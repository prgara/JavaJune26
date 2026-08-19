package aug18;

public class Main {

    public static void main(String[] args) {
        int num = 5;
        double q = 10;
        int i = (int) q;

        Integer a = num; // autoboxing


        Integer obj = 20;
        int c = obj; // Unboxing







        try{
            int x = 100;
            throw new RuntimeException();
        } finally {
            System.out.println("Finally executed");
        }


    }
}
