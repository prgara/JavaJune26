package jul25;

public class StringDemo {

    public static void main(String[] args) {
        String a = "Hello";
        a = a.concat("World");
        System.out.println(a);
        String hw = a.concat("World");
        System.out.println(a);
        System.out.println(hw);
        String x = new String("Hello");

    }

}
