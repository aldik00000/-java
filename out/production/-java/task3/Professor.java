package task3;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {
    private String department; // кафедра
    private List<String> subjects; // оқытатын пәндері
    private double salary; // жалақы
    private int experience; // тәжірибе (жыл)

    public Professor(String firstName, String lastName, int age, String email,
                     String department, double salary, int experience) {
        super(firstName, lastName, age, email);
        this.department = department;
        this.salary = salary;
        this.experience = experience;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(String subject) {
        subjects.add(subject);
        System.out.println(firstName + " " + subject + " пәнін қосты");
    }

    public void teach() {
        System.out.println(firstName + " " + department + " кафедрасында сабақ береді");
        if (!subjects.isEmpty()) {
            System.out.println("   Оқытатын пәндері: " + String.join(", ", subjects));
        }
    }

    public double calculateHourlyRate(int hoursPerWeek) {
        // Айлық жалақыны сағаттық ставкаға айналдыру
        double monthlySalary = salary;
        double hourlyRate = monthlySalary / (4 * hoursPerWeek);
        return hourlyRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Кафедра: " + department);
        System.out.println("Тәжірибе: " + experience + " жыл");
        System.out.println("Жалақы: " + salary + " теңге");
    }
}