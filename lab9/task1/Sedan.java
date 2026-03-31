package task1;

public class Sedan extends Car {
    private static final double FUEL_CONSUMPTION_RATE = 7.0; // 100 км-ге литр

    public Sedan(String brand, int speed, String fuelType) {
        super(brand, speed, fuelType);
    }

    @Override
    public double calculateFuelConsumption(double distance) {
        return (distance / 100) * FUEL_CONSUMPTION_RATE;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("   Седан типі: Экономикалық, 100 км-ге " +
                FUEL_CONSUMPTION_RATE + " литр");
    }

    public void openTrunk() {
        System.out.println(brand + " седанының багажы ашылды");
    }
}