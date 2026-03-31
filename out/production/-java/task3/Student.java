package task3;

public class Student extends Person {
    private int studentId;
    private String major; // мамандығы
    private double gpa; // орташа балл
    private int course; // курс

    public Student(String firstName, String lastName, int age, String email,
                   int studentId, String major, int course) {
        super(firstName, lastName, age, email);
        this.studentId = studentId;
        this.major = major;
        this.course = course;
        this.gpa = 0.0;
    }

    public void study() {
        System.out.println(firstName + " " + major + " мамандығы бойынша оқиды");
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
        System.out.println(firstName + " GPA жаңартылды: " + gpa);
    }

    public void takeExam(String subject) {
        System.out.println(firstName + " " + subject + " пәнінен емтихан тапсырады");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Студент ID: " + studentId);
        System.out.println("Мамандығы: " + major + ", Курс: " + course);
        System.out.println("GPA: " + (gpa > 0 ? gpa : "әлі жоқ"));
    }
}