import java.util.Scanner;

public class ScannerSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float width;
        float height;
        System.out.println("Enter the width");
        width = Float.parseFloat(sc.nextLine());

        System.out.println("Enter the height");
        height = Float.parseFloat(sc.nextLine());

        float area = width * height;

        System.out.println(area);
    }
}
