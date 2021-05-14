import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] key = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        String[] value = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "night"};
        do {
            System.out.println("Enter the choice");
            int choice = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < key.length; i++) {
                if (choice == key[i]) {
                    System.out.println(value[i]);
                }
            }
        } while (true);
    }
}
