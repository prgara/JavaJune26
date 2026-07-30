package jul28;

public class A {

    static int x = 100;


    public static void main(String[] args) {
        String a = "Hello";

        for (int i = 0; i < 1000000; i++) {
            a += i;
          //  System.out.println(a);
        }
        String x = "hello";
        String concat = x.concat(" world");
        System.out.println(x);
        System.out.println(concat);
        StringBuffer sb = new StringBuffer("hello ");
        sb.append("world");
        System.out.println(sb);

        StringBuilder sbb = new StringBuilder("hello");
        sbb.append("world");

    }
}
