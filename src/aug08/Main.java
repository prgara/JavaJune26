package aug08;

public class Main {


    int sum (int a, int b ){
        return a+b;
    }

    void sum(int a, int b, int c){

    }

    public static void main(String[] args) {
        Animal dog = new Dog(); // upcasting
        dog.sound();
        System.out.println(dog.legs);
        dog.hasLegs();

//        B b = new B();
        B param = new B(12);
        SuperCar car = new SuperCar();
        car.start();
    }
}
