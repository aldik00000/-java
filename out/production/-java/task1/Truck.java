package task1;

public class Truck extends Car {
    private static final double FUEL_CONSUMPTION_RATE = 20.0;
    private int cargoCapacity; // жүк көтерімділігі (тонна)

    public Truck(String brand, int speed, String fuelType, int cargoCapacity) {
        super(brand, speed, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateFuelConsumption(double distance) {
        return (distance / 100) * FUEL_CONSUMPTION_RATE;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("   Жүк көлігі, Жүк сыйымдылығы: " + cargoCapacity +
                " тонна, Шығыны: 100 км-ге " + FUEL_CONSUMPTION_RATE + " литр");
    }

    public void loadCargo(int tons) {
        if (tons <= cargoCapacity) {
            System.out.println(tons + " тонна жүк тиелді");
        } else {
            System.out.println("Жүк тым ауыр! Максимум: " + cargoCapacity + " тонна");
        }
    }
}