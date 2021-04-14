package managementHotel.structural;

import managementHotel.creat.Customer;

public interface Action {
    double PRICE_ROOM_1 = 100d;
    double PRICE_ROOM_2 = 200d;

    Customer[] add(Customer[] listCustomer);

    Customer[] edit(Customer[] listCustomer);

    Customer[] reMove(Customer[] listCustomer);

    void showInfoCustomer();

    Customer inputInfoCus();

    void menu();

    Customer[] checkOut(Customer[] listCustomer);

}
