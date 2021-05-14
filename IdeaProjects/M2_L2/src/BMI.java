import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float bmi, weight, height;
        do {
            System.out.println();
            System.out.println("Enter the weight");
            weight = Float.parseFloat(sc.nextLine());

            System.out.println("Enter the weight");
            height = Float.parseFloat(sc.nextLine());

            bmi = weight / (height * height);

            if (bmi < 18) {
                System.out.printf("%-5f%s", bmi, "under");
            } else if (bmi < 25) {
                System.out.printf("%-30f%s", bmi, "normal");
            } else if (bmi < 30) {
                System.out.printf("%-20.2f%s", bmi, "over");
            } else {
                System.out.printf("%f%s", bmi, "obese");
            }
        } while (true);
    }
}
