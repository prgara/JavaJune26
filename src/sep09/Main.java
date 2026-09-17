package sep09;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {

        FuncInterface abc = x -> System.out.println("Functional interface demo with anonymous class");


        FuncInterface lambda = (x) -> {
            System.out.println(x);
            System.out.println("Functional interface demo with lambdas");
            System.out.println("learning interfaces with java 8");
        };

//        FuncInterface a = new A();
//        a.display(10);
        abc.display(10);
        lambda.display(100);



    }
}
