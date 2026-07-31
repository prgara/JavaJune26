package jul28;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        A a = new A();


       // String x = "Hello"; // create 1 object in SCP
        String t = "Hello"; // create 1 object in SCP
        String y = new String("ABC"); // create 1 obj in SCP & 1 in heap
        String s = new String("ABC"); //  1 in heap
        int [] arr = new int[5];
//        System.out.println(arr.length);
//        System.out.println(x.length());
//        System.out.println(x.toUpperCase());
//        System.out.println(x.toLowerCase());
//        char[] charArray = x.toCharArray();

        String g = "Hello.World ,nendifhre .com";
        System.out.println(g);
        System.out.println(g.trim());
        char c = g.charAt(6);
        System.out.println(c);
        System.out.println(g.indexOf("o"));
        System.out.println("Last index of : " +g.lastIndexOf("o"));
        System.out.println(g.indexOf("l"));
//        System.out.println(x.startsWith("Hel"));
//        System.out.println(x.startsWith("hel"));
        System.out.println(g.endsWith("d"));
//        System.out.println(x.contains("abcd"));
        System.out.println(g.contains("lo W"));
        System.out.println(g.replace("Hello", "Hi"));
        String[] s1 = g.split("\\.");
        for (String x : s1){
            System.out.println(x);
        }


        String q = "Hello"; //12x58b
        String e = "Hello";
        String r = new String("hello"); //34c67g
        System.out.println(q == e);
        System.out.println(q == r);
        System.out.println(q.equalsIgnoreCase(r));



    }

    // static in a non static context - No
    // non static in a static context - Yes
}
