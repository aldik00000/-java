package task3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 3-ТАПСЫРМА: УНИВЕРСИТЕТ ЖҮЙЕСІ ===\n");

        // Студент жасау
        Student student = new Student("Али", "Хан", 20, "ali.khan@university.kz",
                12345, "Ақпараттық технологиялар", 2);
        student.setGpa(3.8);

        // Профессор жасау
        Professor professor = new Professor("Джон", "Доу", 45, "john.doe@university.kz",
                "Математика", 450000, 15);
        professor.addSubject("Алгебра");
        professor.addSubject("Геометрия");
        professor.addSubject("Тригонометрия");

        // Магистрант жасау
        GraduateStudent gradStudent = new GraduateStudent("Мария", "Петрова", 24,
                "maria@university.kz",
                54321, "Физика", 1,
                "Нанотехнология", "Проф. Иванов");

        System.out.println("📚 СТУДЕНТ АҚПАРАТЫ:");
        student.displayInfo();
        student.study();
        student.takeExam("Java бағдарламалау");

        System.out.println("\n👨‍🏫 ПРОФЕССОР АҚПАРАТЫ:");
        professor.displayInfo();
        professor.teach();
        double hourlyRate = professor.calculateHourlyRate(20);
        System.out.println("   Сағаттық ставка: " + String.format("%.2f", hourlyRate) + " теңге/сағ");

        System.out.println("\n🎓 МАГИСТРАНТ АҚПАРАТЫ:");
        gradStudent.displayInfo();
        gradStudent.study();
        gradStudent.defendThesis();
    }
}