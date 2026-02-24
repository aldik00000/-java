import java.util.Scanner;

public class  main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("x мәнін енгізіңіз: ");
        double x = input.nextDouble();

        double f;

        if (x >= 2.5) {
            f = 3 * x + 5;
        }
        else if (x >= 1.5 && x < 2.5) {
            f = Math.pow(x, 3) * Math.sin(x);
        }
        else {
            f = x * Math.tan(x) - Math.sin(x);
        }

        System.out.println("f(x) = " + f);

        input.close();
    }
}