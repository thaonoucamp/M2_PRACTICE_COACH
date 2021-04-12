package inheritance;

import java.util.ArrayList;

public class TestBridge {

    public static void main(String[] args) {
        Book[] listBook = new Book[10];

        listBook[0] = new ProgramingBook("1", "Java", 1000, "A", "Java", "Spring");
        listBook[1] = new ProgramingBook("2", "Java", 500, "B", "Java", "Spring");
        listBook[2] = new ProgramingBook("3", "Java", 300, "C", "Java", "Spring");
        listBook[3] = new ProgramingBook("4", "Java", 200, "D", "Java", "Spring");
        listBook[4] = new ProgramingBook("5", "Java", 100, "E", "Java", "Spring");
        listBook[5] = new FictionBook("6", "Java", 600, "F", "Core");
        listBook[6] = new FictionBook("7", "Java", 700, "G", "Spring");
        listBook[7] = new FictionBook("8", "Java", 900, "H", "Spring");
        listBook[8] = new FictionBook("9", "Java", 800, "I", "Spring");
        listBook[9] = new FictionBook("10", "Java", 1500, "K", "Spring");

        Action action = new Action();
//        action.countQuantityProgramingBook(listBook);
//        action.sortBook(listBook);
        action.totalTenBook(listBook);
    }
}
