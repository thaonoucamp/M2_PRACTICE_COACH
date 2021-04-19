package management_library.behavial;

import management_library.creat.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {
    int BACK_BOOK = 7;
    int DAY_MONTH = 30;
    List<Student> lists = new ArrayList<Student>();

    Scanner sc = new Scanner(System.in);

    public Student inputInfo() {
        Student newStudent = new Student();

        System.out.println("Enter the name");
        while (true) {
            boolean check = newStudent.setName(sc.nextLine());
            if (check) {
                break;
            }
        }

        System.out.println("Enter the birthday");
        while (true) {
            boolean check = newStudent.setBirthday(sc.nextLine());
            if (check) {
                break;
            }
        }


        System.out.println("Enter the class name");
        while (true) {
            boolean check = newStudent.set_class(sc.nextLine());

            if (check) {
                break;
            }
        }

        System.out.println("Enter the code card");
        while (true) {
            boolean check = newStudent.setCodeCard(sc.nextLine());
            if (check) {
                break;
            }
        }

        System.out.println("Enter the rent day");
        while (true) {
            boolean check = newStudent.setBorrowDay(sc.nextLine());
            if (check) {
                break;
            }
        }

        System.out.println("Enter the day back book");
        while (true) {
            boolean check = newStudent.setReturnDay(sc.nextLine());
            if (check) {
                break;
            }
        }

        System.out.println("Enter the name book");
        while (true) {
            boolean check = newStudent.setNameBook(sc.nextLine());
            if (check) {
                break;
            }
        }

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

        System.err.println("list after add --->");
        show(list);
    }

    public void show(List<Student> list) {
        sort(list);
        for (Object s :
                list) {
            System.out.println(s);
        }
    }

    public void edit(List<Student> list) {
        String code_Card;
        System.out.println("Enter the code card want to edit:");
        code_Card = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCodeCard().equals(code_Card)) {
                System.out.println("Invite edit info of student " + list.get(i).getName());
                list.set(i, inputInfo());
            }
        }

        System.err.println("Lists after edit---->");
        show(list);
    }

    public void delete(List<Student> list) {
        String code_Card;

        System.err.println("Enter the code card want delete---->");
        code_Card = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCodeCard().equals(code_Card)) {
                list.remove(i);
            }
        }

        System.err.println("List after delete---->");
        show(list);
    }

    public void find(List<Student> list) {
        String findWantFind;

        System.err.println("Enter the code card want find");
        findWantFind = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCodeCard().equals(findWantFind)) {
                System.out.println(list.get(i));
            }
        }
    }

    public void sort(List<Student> list) {
        list.sort((o1, o2) -> {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            } else if (o1.getCodeCard().compareTo(o2.getCodeCard()) > 0) {
                return 1;
            } else {
                return -1;
            }
        });
    }

    public void backBookDay(List<Student> list) {
        int back_book_over;

        for (int i = 0; i < list.size(); i++) {
            String day = list.get(i).getBorrowDay().split("-")[0];
            back_book_over = DAY_MONTH - (BACK_BOOK + Integer.parseInt(day));
            System.err.println("days full to back book of student " + list.get(i).getCodeCard() + " is: " + back_book_over);
        }
    }


    public void showMenu() {
        int choice;
        do {
            System.err.println("Menu :" +
                    "\n1. ADD" +
                    "\n2. EDIT" +
                    "\n3. DELETE" +
                    "\n4. FIND" +
                    "\n5. BACK_BOOK" +
                    "\n6. EXIT" +
                    "\nEnter your choice:");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    add(lists);
                    break;
                case 2:
                    edit(lists);
                    break;
                case 3:
                    delete(lists);
                    break;
                case 4:
                    find(lists);
                    break;
                case 5:
                    backBookDay(lists);
                    break;
                case 6:
                    System.exit(6);
                    break;
            }
        } while (choice != 6);
    }
}
