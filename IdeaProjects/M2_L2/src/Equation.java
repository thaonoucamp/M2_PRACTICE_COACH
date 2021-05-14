import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a * x + b = 0");
        double a, b, c;
        double solution;

        System.out.println("Enter the a");
        a = Double.parseDouble(sc.nextLine());

        System.out.println("Enter the b");
        b = Double.parseDouble(sc.nextLine());

        System.out.println("Enter the c");
        c = Double.parseDouble(sc.nextLine());

        if (a != 0) {
            solution = -b / a;
            System.out.printf("%f", solution);
        }
        if (a == 0) {
            double answer = (c - b) / a;
            System.out.printf("%f", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all X");
            } else {
                System.out.print("No solution");
            }
        }
    }
}
