package task3;

public class GraduateStudent extends Student {
    private String thesisTopic; // диссертация тақырыбы
    private String supervisor; // ғылыми жетекші

    public GraduateStudent(String firstName, String lastName, int age, String email,
                           int studentId, String major, int course,
                           String thesisTopic, String supervisor) {
        super(firstName, lastName, age, email, studentId, major, course);
        this.thesisTopic = thesisTopic;
        this.supervisor = supervisor;
    }

    public void defendThesis() {
        System.out.println(firstName + " диссертация қорғайды!");
        System.out.println("   Тақырыбы: " + thesisTopic);
        System.out.println("   Жетекшісі: " + supervisor);
    }

    @Override
    public void study() {
        System.out.println(firstName + " магистратурада зерттеу жүргізеді");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Диссертация: " + thesisTopic);
        System.out.println("Ғылыми жетекші: " + supervisor);
        System.out.println("Студент деңгейі: Магистрант");
    }
}