package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 2-ТАПСЫРМА: ЖАНУАРЛАР ӘЛЕМІ ===\n");

        // Объектілерді жасау
        Dog dog = new Dog("Ақтөс", 3, "Неміс овчаркасы");
        Cat cat = new Cat("Мурка", 2, true);
        Bird bird = new Bird("Сайра", 1, 25.5);

        // Полиморфизм - ArrayList қолдану
        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(bird);

        // Әр жануар туралы ақпарат
        for (Animal animal : animals) {
            animal.displayInfo();
            animal.sound();
            animal.move();

            // Тек өзіне тән әдістер
            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Cat) {
                ((Cat) animal).scratch();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
            System.out.println();
        }
    }
}