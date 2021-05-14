package print20Mod;

import java.util.Scanner;

public class Print20Mod {
    static int num;
    static Scanner sc = new Scanner(System.in);

    public static void checkMod() {
        System.out.println("Enter you want to check");
        num = Integer.parseInt(sc.nextLine());

        for (int i = 2; i <= num; i++) {
            if (num % Math.sqrt(i) == 0) {
                break;
            } else {
                System.out.println(num);
            }
        }
    }

    public static void countModNum() {
        int count = 0;
        while (count <= num) {
            checkMod();
        }
    }

    public static void main(String[] args) {
        countModNum();
    }
}
