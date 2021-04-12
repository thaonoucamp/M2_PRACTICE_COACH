package inheritance;

public class Action implements Behavior {
    @Override
    public void countQuantityProgramingBook(Book[] listBook) {
        int count = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof ProgramingBook) {
                if (((ProgramingBook) listBook[i]).getLanguage().equals("Java")) {
                    count++;
                }
            }
        }
        System.out.println("the quantity ProgramingBook in ListBook : " + count);
    }

    @Override
    public void sortBook(Book[] listBook) {
        for (int i = 0; i < listBook.length; i++) {
            Book temp;
            for (int j = i; j < listBook.length - 1; j++) {
                if (listBook[j].getPrice() > listBook[j + 1].getPrice()) {
                    temp = listBook[j + 1];
                    listBook[j + 1] = listBook[j];
                    listBook[j] = temp;
                }
            }
        }
        for (Book b :
                listBook) {
            b.toString();
        }
    }

    @Override
    public void totalTenBook(Book[] listBook) {
        int sum = 0;
        for (Book b :
                listBook) {
            sum += b.getPrice();
        }
        System.out.println("Total money of listBook is : " + sum);
    }
}
