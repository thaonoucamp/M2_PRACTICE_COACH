import java.util.Scanner;

public class IsMod3 {

    public boolean isMod3(int number) {

        if (number % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void testNum() {
        do {
            int number;
            boolean check;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so muon kiem tra");
            number = Integer.parseInt(sc.nextLine());
            check = isMod3(number);

        } while (true);

    }

    public boolean isPrime(int number) {
        if (number > 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsMod3 is = new IsMod3();
        boolean check;
        check = is.isPrime(2);
        System.out.println(check);
//        is.testNum();
    }

}
