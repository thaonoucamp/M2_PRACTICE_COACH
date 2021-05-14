import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        double RATE = 23000d;
        double result;
        do {
            System.out.println();
            System.out.println("Enter the money want to rate");
            System.out.printf("money :");
            money = Integer.parseInt(sc.nextLine());

            result = money * RATE;
            System.out.printf("Result :" + result);
        } while (true);
    }
}
