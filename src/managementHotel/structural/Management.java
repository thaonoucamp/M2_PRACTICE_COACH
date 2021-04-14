package managementHotel.structural;

import managementHotel.creat.Customer;

import java.util.Scanner;

public class Management implements Action {

    Customer[] listCustomer = new Customer[0];
    Scanner sc = new Scanner(System.in);


    @Override
    public Customer[] add(Customer[] listCustomer) {
        listCustomer = new Customer[+1];
        for (int i = 0; i < listCustomer.length; i++) {
            System.out.println("Input Customer index " + (i + 1));
            if (listCustomer[i] == null) {
                listCustomer[i] = inputInfoCus();
            } else {
                System.out.println("ROOM INDEX " + i + "FULL");
            }
        }
        System.out.println("List customer after add : ");
        showInfoCustomer();

        return listCustomer;
    }

    @Override
    public Customer[] edit(Customer[] listCustomer) {
        int id;

        System.out.println("Enter the id you want to edit :");
        id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < listCustomer.length; i++) {
            if (listCustomer[i].getId() == id) {
                listCustomer[i] = inputInfoCus();
            }
        }

        System.out.println("List customer after edit :");
        showInfoCustomer();

        return listCustomer;
    }

    @Override
    public Customer[] reMove(Customer[] listCustomer) {
        Customer[] afDeListCus = new Customer[listCustomer.length-1];
        int id;

        System.out.println("Enter the id you want to delete :");
        id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < listCustomer.length; i++) {
            if (listCustomer[i].getId() == id) {
                listCustomer[i] = listCustomer[i + 1];
            }
        }
        afDeListCus = listCustomer;

        return afDeListCus;
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
                    "\n1. Add Customer." +
                    "\n2. Edit Customer." +
                    "\n3. Remove Customer." +
                    "\n4. Sort by id Customer." +
                    "\n5. Check out." +
                    "\n6. Exit.");

            int choice;
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    add(listCustomer);
                    break;
                case 2:
                    edit(listCustomer);
                    break;
                case 3:
                    reMove(listCustomer);
                    break;
                case 4:
                    listCustomer = sortIdCustomer(listCustomer);
                    System.out.println("List customer after sort :");
                    showInfoCustomer();
                    break;
                case 5:
                    checkOut(listCustomer);
                    break;
                case 6:
                    System.out.println("SEE YOU AGAIN !");
                    System.exit(6);
            }

        } while (true);
    }

    @Override
    public Customer[] sortIdCustomer(Customer[] listCustomer) {
        for (int i = 0; i < listCustomer.length; i++) {
            Customer temp;
            for (int j = 0; j < listCustomer.length; j++) {
                if (listCustomer[i].getId() > listCustomer[j].getId()) {
                    temp = listCustomer[i];
                    listCustomer[i] = listCustomer[j];
                    listCustomer[j] = temp;
                }
            }
        }

        return listCustomer;
    }

    @Override
    public Customer[] checkOut(Customer[] listCustomer) {
        double total;
        int id;

        System.out.println("Enter the id you want to check out :");
        id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < listCustomer.length; i++) {
            if (listCustomer[i].getId() == id) {
                total = listCustomer[i].getDayRent() * listCustomer[i].PRICE_ROOM;
                listCustomer[i] = null;
                System.out.println("Bill have to pay : " + total);
            }
        }
        return listCustomer;
    }
}
