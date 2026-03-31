package task2;

public class Cat extends Animal {
    private boolean isIndoor; // үй мысығы ма?

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    @Override
    public void sound() {
        System.out.println(name + " (мысық) : МИЯУ-МИЯУ! 🐱");
    }

    @Override
    public void move() {
        System.out.println(name + " тыныш жүреді...");
    }

    public void scratch() {
        System.out.println(name + " тырнап алды!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("   Үй мысығы: " + (isIndoor ? "Иә" : "Жоқ"));
    }
}