package aug08;

public class Dog extends Animal{

    int legs = 4;
    void sound(){
        System.out.println("Dog barks");
    }

    void hasLegs() {
        System.out.println(super.legs);
    }
}
