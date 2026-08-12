package aug11;

public class TruckMain {

    public static void main(String[] args) {
        Engine engine = new ElectricEngine();
        Engine dieselEngine = new DieselEngine();
        Truck truck = new Truck(dieselEngine);
        truck.drive();
    }
}
