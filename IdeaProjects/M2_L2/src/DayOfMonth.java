import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice");
        int month;
        do {
            month = Integer.parseInt(sc.nextLine());
            switch (month) {
                case 1, 3, 5, 7, 10, 12 -> System.out.println("Month is 31 days");
                case 4, 6, 8, 9, 11 -> System.out.println("Month is 30 days");
                case 2 -> System.out.println("Month is 28 or 29 days");
                default -> System.out.println("Enter repeat the month");
            }
        } while (month != 0);
    }
}
