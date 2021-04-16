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

    public void add(List<Student> list) {
        int quantity;
        System.out.println("Enter quantity want to add");

        quantity = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Enter index student " + i);

            list.add(inputInfo());
        }

        System.out.println("list after add --->");
        show(list);
    }

    public void show(List<Student> list) {
        for (Object s :
                list) {
            System.out.println(s);
        }
    }

    public void edit(List<Student> list) {
        int code_Card;
        System.out.println("Enter the code card want to edit:");
        code_Card = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCodeCard() == code_Card) {
                System.out.println("Invite edit info of " + list.get(i).getName());
                list.set(i, inputInfo());
            }
        }
    }
}
