package aug11;

public class Truck {

    private Engine engine;

    public Truck(Engine engine) {
        this.engine = engine;
    }

    void drive(){
        engine.start();
        System.out.println("Truck is moving now");
    }
}
