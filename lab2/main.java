import java.util.Scanner;

// 1-класс (негізгі, main.java.java осы жерде)
public class fclass1 {

    int a, b;

    public static void main(String[] args) {
        fclass2 obj = new fclass2();

        obj.inputValues();
        obj.show1();
        obj.show3();
        obj.show2();

        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }

    public void show1() {
        System.out.println("Бұл fclass1 класы");
    }
}

// 2-класс (fclass1 мұрагері)
class fclass3 extends fclass1 {

    public void show3() {
        System.out.println("Бұл fclass3 класы");
    }
}

// 3-класс (fclass3 мұрагері)
class fclass2 extends fclass3 {

    public void show2() {
        System.out.println("Бұл fclass2 класы");
    }

    public void inputValues() {
        Scanner sc = new Scanner(System.in);

        System.out.print("a мәнін енгіз: ");
        a = sc.nextInt();

        System.out.print("b мәнін енгіз: ");
        b = sc.nextInt();
    }
}