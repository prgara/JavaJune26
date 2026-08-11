package aug08;

public class Car extends Vehicle{

    public Car(String color) {
        super(color);
    }

    @Override
    void start() {
        System.out.println("Car is started");
    }

    @Override
    void stop() {
        System.out.println("car is stopped");
    }
}
