package aug18;

import java.util.ArrayList;

public class ConatinerMain {

    public static void main(String[] args) {
        Container<String,String> container = new Container<>("Chair","Table");
        Container<Integer,Integer> container1 = new Container<>(20,10);
        Container<Boolean,Integer> container12 = new Container<>(true,10);
        System.out.println(container);
        System.out.println(container1);


        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Raj",30,10));
        list.add(new Student("Tom",31,11));
        list.add(new Student("Harry",32,10));

        System.out.println(list.toString());

    }
}
