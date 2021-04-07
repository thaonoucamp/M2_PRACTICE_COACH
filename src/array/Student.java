package array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);
    static String[][] student = new String[2][4];


    public static void main(String[] args) {
        int choice;

        showMenu();

        do {
            System.out.println("Enter your choice");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showInfoStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                default:
                    System.out.printf("SEE YOU AGAIN");
                    System.exit(choice);
            }
        } while (choice != 4);
    }

    private static void deleteStudent() {

    }

    private static void showInfoStudent() {

        for (int i = 0; i < student.length; i++) {
            System.out.printf("%s %s %s %s \n", student[i][0], student[i][1], student[i][2], student[i][3]);
        }
    }

    private static void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Them sinh vien");
        System.out.println("2. Xoa sinh vien");
        System.out.println("3. Hien thi thong tin sinh vien");
        System.out.println("4. Thoat");
    }

    private static void inputInfoStudent() {
        String info = "";
        int quantityStudent;
        System.out.println("Enter the quantity student your want to input");
        quantityStudent = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter student queue " + (i + 1));

            System.out.println("Enter your name");
            info = student[i][0] = sc.nextLine();
            System.out.println("Enter your id");
            info = student[i][1] = sc.nextLine();
            System.out.println("Enter your birthday");
            info = student[i][2] = sc.nextLine();
            System.out.println("Enter your mark");
            info = student[i][3] = sc.nextLine();
        }
    }

    public static void addStudent() {
        inputInfoStudent();
    }
}
