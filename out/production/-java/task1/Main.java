package task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1-ТАПСЫРМА: АВТОКӨЛІКТЕР ===");

        Sedan sedan = new Sedan("Toyota Camry", 220, "Бензин");
        Truck truck = new Truck("Volvo FH", 140, "Дизель", 20);
        SUV suv = new SUV("Land Cruiser Prado", 200, "Дизель", true);

        // Полиморфизм - барлығын Car массивінде сақтау
        Car[] cars = {sedan, truck, suv};

        for (Car car : cars) {
            car.displayInfo();
            double distance = 250; // 250 км жол
            double fuelNeeded = car.calculateFuelConsumption(distance);
            System.out.println("   " + distance + " км жолға қажет отын: " +
                    String.format("%.2f", fuelNeeded) + " литр");

            // Тек өзіне тән әдістерді шақыру
            if (car instanceof Sedan) {
                ((Sedan) car).openTrunk();
            } else if (car instanceof Truck) {
                ((Truck) car).loadCargo(15);
            } else if (car instanceof SUV) {
                ((SUV) car).enableOffRoadMode();
            }
            System.out.println();
        }
    }
}