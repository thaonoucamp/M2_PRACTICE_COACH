package loop;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void checkModNum() {
        System.out.println("Enter you want to check");
        int num = Integer.parseInt(sc.nextLine());

        if (num > 2) {
            System.out.println(num + " is not the mod number");
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not the mod number");
            } else {
                System.out.println(num + " is the mod number");
            }
        }
    }

    public static void checkParityNum() {
        System.out.println("Enter you want to check");
        int num = Integer.parseInt(sc.nextLine());

        if (num % 2 == 0) {
            System.out.println(num + " SO CHAN");
        } else {
            System.out.println(num + " LA SO LE");
        }
    }

    public static void checkRighteous() {
        System.out.println("Enter you want to check");
        int num = Integer.parseInt(sc.nextLine());

        if (num == (Math.pow(num, num))) {
            System.out.println(num + " is the righteous");
        } else {
            System.out.println(num + " is not the righteous");
        }
    }

    public static void main(String[] args) {
        while (true) {

            System.out.println("1. check the mod number");
            System.out.println("2. check the parity number");
            System.out.println("3. check the righteous number");
            System.out.println("4. exit");
            System.out.println("Enter your choice");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    checkModNum();
                    break;
                case 2:
                    checkParityNum();
                    break;
                case 3:
                    checkRighteous();
                    break;
                case 4:
                    System.out.println("SEE YOU AGAIN");
                    break;
            }
        }
    }
}
// 1- kiem tra so nguyen to;
// 2- kiem tra so chan le;
// 3- kiem tra so chinh phuong;
// 4- exit;