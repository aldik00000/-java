package task2;

public class Bird extends Animal {
    private double wingSpan; // қанат жайылымы (см)

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    @Override
    public void sound() {
        System.out.println(name + " (құс) : САЙРАЙДЫ! 🐦");
    }

    @Override
    public void move() {
        System.out.println(name + " ұшып кетті!");
    }

    public void fly() {
        System.out.println(name + " аспанға көтерілді! Қанат жайылымы: " + wingSpan + " см");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("   Қанат жайылымы: " + wingSpan + " см");
    }
}