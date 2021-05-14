import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        do {
            System.out.printf("Enter year want to check :");
            year = Integer.parseInt(sc.nextLine());
            if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                System.out.printf("is leap year");
            } else {
                System.out.printf("is not leap year");
            }
        } while (year != 0);
    }
}
