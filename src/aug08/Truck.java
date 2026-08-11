package aug08;

public class Truck extends Vehicle{


    public Truck(String color) {
        super(color);
    }

    @Override
    void start() {
        System.out.println("truck is started");
    }

    @Override
    void stop() {
        System.out.println("Truck is stopped");
    }
}
