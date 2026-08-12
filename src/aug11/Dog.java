package aug11;

public class Dog extends Animal{


    void bark(){
        System.out.println("Dog barking");
    }

    @Override
    void sound() {
        System.out.println("Bark");
    }
}
