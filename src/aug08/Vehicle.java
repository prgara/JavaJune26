package aug08;

public abstract class Vehicle  {

    String color;

    public Vehicle(String color) {
        this.color = color;
    }

    abstract void start();


    void vehicleDetails(){
        System.out.println("Vehicle is of "+ color + "color");
    }

    abstract void stop();
}
