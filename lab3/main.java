import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Вариант номерін енгізіңіз (1-27): ");
        int v = sc.nextInt();

        double x, y, a, b, c, s;

        switch (v) {

            case 1: {
                System.out.print("x енгізіңіз: ");
                x = sc.nextDouble();
                y = Math.exp(x) + Math.sin(x * x) - Math.pow(x, 3);
                System.out.println("y = " + y);
                break;
            }

            case 2: {
                System.out.print("x енгізіңіз: ");
                x = sc.nextDouble();
                if (x <= 0) {
                    System.out.println("log(x) үшін x > 0 болуы керек!");
                    break;
                }
                y = Math.exp(x) - 4 * x + 3 * Math.log(x) + 1.45;
                System.out.println("y = " + y);
                break;
            }

            case 3: {
                System.out.print("x енгізіңіз: ");
                x = sc.nextDouble();
                if (x <= 0) {
                    System.out.println("log(x) үшін x > 0 болуы керек!");
                    break;
                }
                y = Math.tan(x) + Math.log(x) + 5 * x * x + 18;
                System.out.println("y = " + y);
                break;
            }

            case 4: {
                System.out.print("x енгізіңіз: ");
                x = sc.nextDouble();
                y = Math.cos(x) + 5 * x + 27 - Math.PI;
                System.out.println("y = " + y);
                break;
            }

            case 5: {
                System.out.print("x енгізіңіз: ");
                x = sc.nextDouble();
                if (x <= 0) {
                    System.out.println("log(x) үшін x > 0 болуы керек!");
                    break;
                }
                y = Math.log(x) + 5 * x + 5 - Math.PI;
                System.out.println("y = " + y);
                break;
            }

            case 6: {
                System.out.print("x енгізіңіз: ");
                x = sc.nextDouble();
                y = (int) x % 5 + (int) x / 5 + Math.exp(x);
                System.out.println("y = " + y);
                break;
            }

            case 7: {
                System.out.print("x енгізіңіз: ");
                x = sc.nextDouble();
                if (x <= 0) {
                    System.out.println("log(x) үшін x > 0 болуы керек!");
                    break;
                }
                y = (int) x % 6 + Math.log(x) + x * x;
                System.out.println("y = " + y);
                break;
            }

            case 8: {
                System.out.print("x енгізіңіз: ");
                x = sc.nextDouble();
                y = Math.sin(x) + 35 + 4 * x + 34 * Math.tan(x);
                System.out.println("y = " + y);
                break;
            }

            case 9: {
                System.out.print("x енгізіңіз: ");
                x = sc.nextDouble();
                if (x <= 0) {
                    System.out.println("log(x) үшін x > 0 болуы керек!");
                    break;
                }
                y = Math.exp(x) + Math.cos(x) + Math.log(x) + 34 * x + 57;
                System.out.println("y = " + y);
                break;
            }

            case 10: {
                System.out.print("x енгізіңіз: ");
                x = sc.nextDouble();
                if (x <= 0) {
                    System.out.println("log(x) үшін x > 0 болуы керек!");
                    break;
                }
                y = Math.log(x) + Math.sin(x) + 5 * x + 3 + 4 * Math.tan(x);
                System.out.println("y = " + y);
                break;
            }

            case 11: {
                System.out.print("x енгізіңіз: ");
                x = sc.nextDouble();
                y = Math.tan(x) + Math.sin(x) + Math.exp(x) + 7 + 2 * x + 33 + Math.PI;
                System.out.println("y = " + y);
                break;
            }

            case 12: {
                System.out.print("x енгізіңіз: ");
                x = sc.nextDouble();
                if (x <= 0) {
                    System.out.println("log(x) үшін x > 0 болуы керек!");
                    break;
                }
                y = Math.log(x) + Math.cos(x) + 5 * x + 3 + 2 + 3 * Math.PI;
                System.out.println("y = " + y);
                break;
            }

            case 13: {
                System.out.print("x1 y1 x2 y2 енгізіңіз: ");
                double x1 = sc.nextDouble();
                double y1 = sc.nextDouble();
                double x2 = sc.nextDouble();
                double y2 = sc.nextDouble();
                double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                System.out.println("Қашықтық = " + d);
                break;
            }

            case 14: {
                System.out.print("Катеттер a және b енгізіңіз: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                double h = Math.sqrt(a * a + b * b);
                s = a * b / 2;
                System.out.println("Гипотенуза = " + h);
                System.out.println("Аудан = " + s);
                break;
            }

            case 15: {
                System.out.print("a және b енгізіңіз: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Қосынды = " + (a + b));
                System.out.println("Айырма = " + (a - b));
                System.out.println("Көбейтінді = " + (a * b));
                break;
            }

            case 16: {
                System.out.print("Қабырға енгізіңіз: ");
                a = sc.nextDouble();
                s = (Math.sqrt(3) / 4) * a * a;
                System.out.println("Аудан = " + s);
                break;
            }

            case 17: {
                System.out.print("Гипотенуза және катет енгізіңіз: ");
                double hyp = sc.nextDouble();
                a = sc.nextDouble();
                b = Math.sqrt(hyp * hyp - a * a);
                double r = (a + b - hyp) / 2;
                System.out.println("Екінші катет = " + b);
                System.out.println("Іштей шеңбер ауданы = " + Math.PI * r * r);
                break;
            }

            case 18: {
                System.out.print("Үш қабырға енгізіңіз: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                double p = (a + b + c) / 2;
                s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Аудан = " + s);
                break;
            }

            case 19: {
                System.out.print("Екі сан енгізіңіз: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Арифм. орта = " + ((a + b) / 2));
                System.out.println("Геом. орта = " + Math.sqrt(Math.abs(a * b)));
                break;
            }

            case 20: {
                System.out.print("t1 v1 t2 v2 енгізіңіз: ");
                double t1 = sc.nextDouble();
                double v1 = sc.nextDouble();
                double t2 = sc.nextDouble();
                double v2 = sc.nextDouble();
                double t = (t1 * v1 + t2 * v2) / (v1 + v2);
                System.out.println("Температура = " + t);
                break;
            }

            case 21: {
                System.out.print("r және n енгізіңіз: ");
                a = sc.nextDouble();
                int n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("n > 0 болуы керек!");
                    break;
                }
                double side = 2 * a * Math.sin(Math.PI / n);
                System.out.println("Периметр = " + (side * n));
                break;
            }

            case 22: {
                System.out.print("r1 r2 r3 енгізіңіз: ");
                double r1 = sc.nextDouble();
                double r2 = sc.nextDouble();
                double r3 = sc.nextDouble();
                double req = 1 / (1 / r1 + 1 / r2 + 1 / r3);
                System.out.println("Нәтижелік кедергі = " + req);
                break;
            }

            case 23: {
                System.out.print("h енгізіңіз: ");
                a = sc.nextDouble();
                double g = 9.8;
                System.out.println("Жылдамдық = " + Math.sqrt(2 * g * a));
                break;
            }

            case 24: {
                System.out.print("Қабырға енгізіңіз: ");
                a = sc.nextDouble();
                System.out.println("Көлем = " + (a * a * a));
                System.out.println("Бет ауданы = " + (6 * a * a));
                break;
            }

            case 25: {
                System.out.print("Екі оң сан енгізіңіз: ");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Арифм. орта = " + ((a + b) / 2));
                System.out.println("Геом. орта = " + Math.sqrt(a * b));
                break;
            }

            case 26: {
                System.out.print("x және y енгізіңіз: ");
                x = sc.nextDouble();
                y = sc.nextDouble();
                System.out.println("Нәтиже = " + ((x + y) / (1 + x * y)));
                break;
            }

            case 27: {
                System.out.print("Шеңбер ұзындығын енгізіңіз: ");
                double L = sc.nextDouble();
                double r = L / (2 * Math.PI);
                System.out.println("Аудан = " + Math.PI * r * r);
                break;
            }

            default:
                System.out.println("Қате вариант!");
        }

        sc.close();
    }
}