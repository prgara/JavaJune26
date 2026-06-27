package jun27;

public class LogicalOpt {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int x = 100;
        int z = 98;
        System.out.println(a==b || a<b); // T
        System.out.println(b!=x && z<b); // F
        System.out.println(a<b || a<b); // T
        System.out.println(a>b || !(a<b)); // F
        System.out.println(z!=a && a<b); // t
        System.out.println( !(a<=b)); // T F
        System.out.println(a>=z || x<=b);  // T F
        System.out.println(z<=a || a<z); // T


    }
}
