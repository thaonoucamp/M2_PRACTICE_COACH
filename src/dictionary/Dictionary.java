package dictionary;

import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] workEng = {"dog", "cat", "book"};
        String[] workViet = {"cho", "meo", "sach"};

        String translator;

        for (int i = 0; i < workEng.length; i++) {
            System.out.println("Enter the work want translator :");
            translator = sc.nextLine();
            if (workEng[i].equals(translator)) {
                System.out.println(workViet[i]);
            }
        }
    }
}
