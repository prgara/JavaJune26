package aug25;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();

        Set<String> fruits = new TreeSet<>();
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("PineApple");

        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Grapes");
        fruits.add("Grapes");

        System.out.println(fruits.contains("Banana"));

        System.out.println(fruits);



        for (String ele : fruits){
            System.out.println(ele);
        }



        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(89);
        nums.add(52);
        nums.add(152);
        nums.add(2);

        System.out.println(nums);
        nums.first();
        nums.last();
        System.out.println(nums.higher(88));

        List<Integer> list = Arrays.asList(34,34,56,43,56,7,8,34,56);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);







    }
}
