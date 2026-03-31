package task2;

public class Dog extends task2.Animal {
    private String breed; // тұқымы

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void sound() {
        System.out.println(name + " (ит) : ГАВ-ГАВ! 🐕");
    }

    @Override
    public void move() {
        System.out.println(name + " жүгіріп келеді!");
    }

    public void fetch() {
        System.out.println(name + " таяқты әкелді!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("   Тұқымы: " + breed + " (ит)");
    }
}