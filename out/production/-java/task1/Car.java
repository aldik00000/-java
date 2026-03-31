package task1;

public class Car {
    protected String brand;
    protected int speed;
    protected String fuelType;

    public Car(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Маркасы: " + brand +
                ", Жылдамдығы: " + speed + " км/сағ" +
                ", Отын түрі: " + fuelType);
    }

    public double calculateFuelConsumption(double distance) {
        // Базалық отын шығыны (100 км-ге)
        return 0;
    }
}