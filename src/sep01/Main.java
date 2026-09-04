package sep01;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Tom", 67);
        marks.put("jack", 69);
        marks.put("tommy", 79);

        System.out.println(marks.get("tommy"));

        Set<Map.Entry<String, Integer>> entries = marks.entrySet();

//        for (Map.Entry<String, Integer> entry : entries) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }


        List<String> nums = new ArrayList<>();
        nums.add("793284932");
        nums.add("793273922");
        Student tom = new Student("Tom", "tom@gmail.com", nums,12);
        Student harry = new Student("Harry", "tom@gmail.com", nums,15);

        List<Student> students = new ArrayList<>();
        students.add(tom);
        students.add(harry);
        Map<Student,Integer> scoreCard = new HashMap<>();
        scoreCard.put(tom,89);

//        System.out.println(scoreCard);

        tom.getPhoneNo().add("7837483748");

        System.out.println(scoreCard.get(tom));

        List<Integer> list = Arrays.asList(2,3,43,1,3,4,4,898,43);
        Collections.reverse(list);
        System.out.println(list);

        System.out.println(students);

    }

}

