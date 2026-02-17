import java.util.Scanner;

public class main {

    // ===== 1-ФУНКЦИЯ =====
    public static double firstFunction(double x) {
        if (x < 0) {
            return 5 * Math.sin(9 * x - 1);
        } else if (x >= 0 && x < 1) {
            return Math.cos(4 * Math.pow(x, 3) + 3);
        } else {
            return Math.pow(x, 2) + 1;
        }
    }

    // ===== 2-ФУНКЦИЯ =====
    public static double secondFunction(double x) {
        if (x < 1.5) {
            return Math.tan(x) * Math.sin(x);
        } else if (x >= 1.5 && x < 2.5) {
            return x * Math.sin(x);
        } else {
            return 3 * x + 5;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== МЕНЮ =====");
            System.out.println("1 - Бірінші функция");
            System.out.println("2 - Екінші функция");
            System.out.println("3 - Массив мысалы");
            System.out.println("4 - Цикл (1-ден 5-ке дейін)");
            System.out.println("0 - Шығу");
            System.out.print("Таңдауыңыз: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("x енгізіңіз: ");
                    double x1 = scanner.nextDouble();
                    System.out.println("Нәтиже: " + firstFunction(x1));
                    break;

                case 2:
                    System.out.print("x енгізіңіз: ");
                    double x2 = scanner.nextDouble();
                    System.out.println("Нәтиже: " + secondFunction(x2));
                    break;

                case 3:
                    int[] numbers = {10, 20, 30, 40, 50};
                    System.out.println("Массив элементтері:");
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.println(numbers[i]);
                    }
                    break;

                case 4:
                    System.out.println("Цикл нәтижесі:");
                    for (int i = 1; i <= 5; i++) {
                        if (i == 3) continue;  // continue мысалы
                        System.out.println(i);
                    }
                    break;

                case 0:
                    System.out.println("Бағдарлама аяқталды.");
                    break;

                default:
                    System.out.println("Қате таңдау!");
            }

        } while (choice != 0); // do-while циклі

        scanner.close();
    }
}