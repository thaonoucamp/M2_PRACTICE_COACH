package managementHotel.creat;

import managementHotel.structural.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room implements Action<Customer> {
    Scanner sc = new Scanner(System.in);

    @Override
    public Customer inputInfo() {
        Customer cus = new Customer();

        System.out.println("Enter the name");
        cus.setName(sc.nextLine());

        System.out.println("Enter the id");
        cus.setId(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter the birthday");
        cus.setBirthday(sc.nextLine());

        System.out.println("Enter the address");
        cus.setAddress(sc.nextLine());

        System.out.println("Enter the rent days");
        cus.setRentDay(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter the type room");
        cus.setTYPE_ROOM(Integer.parseInt(sc.nextLine()));

        return cus;
    }

    @Override
    public List<Customer> add(List<Customer> t) {
        System.out.println("Enter quantity Customer");
        int quantity = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < quantity; i++) {
            t.add(inputInfo());
        }
        return t;
    }

    @Override
    public List<Customer> edit(List<Customer> t) {
        return null;
    }

    @Override
    public List<Customer> delete(List<Customer> t) {
        return null;
    }

    @Override
    public List<Customer> sort(List<Customer> t) {
        return null;
    }

    @Override
    public Customer find(List<Customer> t) {
        return null;
    }

    @Override
    public List<Customer> checkOut(List<Customer> t) {
        return null;
    }

    @Override
    public void show(List<Customer> t) {

    }
}
