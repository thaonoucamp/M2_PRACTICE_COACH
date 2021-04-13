package clean_code;

import java.util.Scanner;

public class Test_Clean_Code {
    static final String isDiv3 = "FIZZ";
    static final String isDiv5 = "BUZZ";
    static final String isDiv3And5 = "FIZZBUZZ";

    static boolean divMod3(int number) {
        return number % 3 == 0;
    }

    static boolean divMod5(int number) {
        return number % 5 == 0;
    }

    static boolean divMod3And5(int number) {
        return divMod3(number) && divMod5(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int number;

            System.out.println("Enter the number :");
            number = Integer.parseInt(sc.nextLine());

            if (divMod3And5(number)) {
                System.out.println(isDiv3And5);
            } else if (divMod3(number)) {
                System.out.println(isDiv3);
            } else if (divMod5(number)) {
                System.out.println(isDiv5);
            } else {
                System.out.println("Exception !");
            }
        } while (true);
    }
}
