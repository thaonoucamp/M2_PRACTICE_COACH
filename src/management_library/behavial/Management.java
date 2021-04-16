package management_library.behavial;

import management_library.creat.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {

    Scanner sc = new Scanner(System.in);

    public Student inputInfo() {
        Student newStudent = new Student();

        System.out.println("Enter the name");
        newStudent.setName(sc.nextLine());

        System.out.println("Enter the birthday");
        newStudent.setBirthday(sc.nextLine());

        System.out.println("Enter the class name");
        newStudent.set_class(sc.nextLine());

        System.out.println("Enter the code card");
        newStudent.setCodeCard(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter the rent day");
        newStudent.setBorrowDay(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter the day back book");
        newStudent.setReturnDay(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter the name book");
        newStudent.setNameBook(sc.nextLine());

        return newStudent;
    }

    public void add(List list) {
        int quantity;
        System.out.println("Enter quantity want to add");

        quantity = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Enter index student " + i);

            list.add(inputInfo());
        }
    }

}
