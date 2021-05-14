import java.util.Scanner;

public class PrintShape {
    public static void drawRectangle() {
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
        }
    }

    public static void drawCircle() {
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }

    public static void drawTriangle() {
        for (int i = 5; i > 0; i--) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }

    public static void Menu() {
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());

        do {
            System.out.println("Menu:");
            System.out.println("1 - Draw Rectangle:");
            System.out.println("2 - Draw Triangle:");
            System.out.println("3 - Draw Square:");
            System.out.println("0 - Exit:");
            System.out.println("Enter the choice your name: ");

            switch (choice) {
                case 1:
                    drawRectangle();
                    break;
                case 2:
                    drawCircle();
                    break;
                case 3:
                    drawTriangle();
                    break;
                case 0:
                    System.out.println("See you again!");
                    break;
                default:
                    break;
            }
        } while (choice > 0 && choice > 5);

    }

    public static void main(String[] args) {
        while (true) {
            PrintShape.Menu();
        }
    }
}
