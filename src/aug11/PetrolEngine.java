package aug11;

public class PetrolEngine {

    void start(){
        System.out.println("Petrol engine started");
    }
}

class Car extends PetrolEngine{

    void drive(){
        start();
        System.out.println("car started");
    }
}
