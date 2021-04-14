package managementHotel.structural;

import managementHotel.creat.Customer;

import java.util.Scanner;

public class Management implements Action {

    Customer[] listCustomer = new Customer[2];
    Scanner sc = new Scanner(System.in);


    @Override
    public void add() {
        for (int i = 0; i < listCustomer.length; i++) {
            System.out.println("Input Customer index " + (i + 1));
            listCustomer[i] = inputInfoCus();
        }
    }

    @Override
    public Customer[] edit(Customer[] listCustomer, int id) {
        Customer[] afEditListCus = new Customer[2];
        for (int i = 0; i < listCustomer.length; i++) {
            if (listCustomer[i].getId() == id) {
                listCustomer[i] = inputInfoCus();
            }
        }
        return afEditListCus = listCustomer;
    }

    @Override
    public Customer[] reMove(Customer[] listCustomer, int id) {
        Customer[] afDeListCus = new Customer[2];
        for (int i = 0; i < listCustomer.length; i++) {
            if (listCustomer[i].getId() == id) {
                listCustomer[i] = null;
            }
        }
        return afDeListCus = listCustomer;
    }

    @Override
    public void showInfoCustomer() {
        for (Customer cus :
                listCustomer) {
            System.out.println(cus);
        }
    }

    @Override
    public Customer inputInfoCus() {
        Customer newCus = new Customer();

        System.out.println("Enter the name");
        newCus.setName(sc.nextLine());

        System.out.println("Enter the birthday");
        newCus.setBirthday(sc.nextLine());

        System.out.println("Enter the id");
        newCus.setId(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter the dayRent");
        newCus.setDayRent(Integer.parseInt(sc.nextLine()));

        return newCus;
    }

    @Override
    public void menu() {
        do {
            System.out.println("Enter your choice :" +
                    "1. Add Customer." +
                    "2. Edit Customer." +
                    "3. Remove Customer." +
                    "4. Show Info Customer." +
                    "5. Check out." +
                    "6. Exit.");

            int choice;
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    edit(listCustomer);
                    break;
                case 3:
                    reMove(listCustomer, "id");
                    break;
                case 4:
                    showInfoCustomer();
                    break;
                case 5:
                    checkOut("id");
                    break;
                case 6:
                    System.out.println("SEE YOU AGAIN !");
                    System.exit(6);
            }

        } while (true);
    }

    @Override
    public double checkOut(int id) {
        double total;
        for (int i = 0; i < listCustomer.length; i++) {
            if (listCustomer[i].getId() == id) {
                double =((double) listCustomer[i].getDayRent()) * PRICE_ROOM_1;
            }
        }
        return 0;
    }
}
