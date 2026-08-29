package aug29;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Harry potter");
        books.push("Game of thrones");
        books.push("Wings of fire");

//        System.out.println(books.peek());
//        System.out.println(books.pop());
//        System.out.println(books.peek());
//        System.out.println(books.peek());


        Queue<Integer> nums = new LinkedList<>();
        Deque<Integer> num = new ArrayDeque<>();
        nums.offer(10);
        nums.offer(30);
        nums.offer(20);
        nums.offer(50);

//
//        System.out.println(nums.peek());
//        System.out.println(nums.poll());
//        System.out.println(nums.peek());
//        System.out.println(nums.peek());
//        System.out.println(nums.peek());
//        System.out.println(nums.peek());


        Map<String,Integer> marks = new HashMap<>(100);
        marks.put("Nidhin",98);
        marks.put("Harpreet",98);
        marks.put("Harpreet",99);
        marks.put("Ram",98);
        marks.put("Sham",98);
        marks.put("Sham",101);
        marks.putIfAbsent("raj",1000);
        System.out.println(marks);
        System.out.println(marks.containsKey("raj"));
        System.out.println(marks.getOrDefault("Sham", 12));


        System.out.println(marks.get("Ram"));
        System.out.println(marks.get("Harpreet"));


        Set<Map.Entry<String, Integer>> entries = marks.entrySet();
        for( Map.Entry<String,Integer> entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
