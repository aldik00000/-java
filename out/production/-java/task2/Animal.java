package task2;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sound() {
        System.out.println(name + " дыбыс шығарады");
    }

    public void move() {
        System.out.println(name + " қозғалады");
    }

    public void displayInfo() {
        System.out.println("Аты: " + name + ", Жасы: " + age);
    }
}