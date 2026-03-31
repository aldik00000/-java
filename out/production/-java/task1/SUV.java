package task1;

public class SUV extends Car {
    private static final double FUEL_CONSUMPTION_RATE = 12.0;
    private boolean fourWheelDrive;

    public SUV(String brand, int speed, String fuelType, boolean fourWheelDrive) {
        super(brand, speed, fuelType);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public double calculateFuelConsumption(double distance) {
        return (distance / 100) * FUEL_CONSUMPTION_RATE;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("   SUV, Толық жетек: " + (fourWheelDrive ? "Иә" : "Жоқ") +
                ", Шығыны: 100 км-ге " + FUEL_CONSUMPTION_RATE + " литр");
    }

    public void enableOffRoadMode() {
        if (fourWheelDrive) {
            System.out.println(brand + " SUV шаңға жүру режиміне қосылды");
        } else {
            System.out.println(brand + " SUV тек қалалық жолдарға арналған");
        }
    }
}