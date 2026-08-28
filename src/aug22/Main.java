package aug22;

import aug18.Student;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("tom",21,21));


        Employee rahul = new Employee("Rahul",2121,2121.0);
        System.out.println(rahul);
        System.out.println(rahul);


        List<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Dragon fruit");

        fruits.add(2,"Kiwi");
        System.out.println(fruits);
        System.out.println(fruits.get(1));
        System.out.println("index of grape is : " +fruits.indexOf("Grapes"));



        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("Canada");
        countries.add("japan");
        countries.add("USA");
        countries.add("China");

        List<String> cities = new ArrayList<>();
        cities.add("Toronto");
        cities.add("Vancouver");
        cities.add("Osaka");
        cities.add("Brampton");

   // India, Toronto,Van,Os,Br, Canad, Japan,.....

    countries.addAll(1,cities);
        System.out.println(countries);

        List<Integer> nums = new LinkedList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));

        }

//        for(String ele: fruits){
//            if (ele.equals("Apple")){
//                fruits.remove("Apple");
//            }
//        }

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
        }


        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        for( Integer ele: nums){
            System.out.println(ele);
        }






    }
}
