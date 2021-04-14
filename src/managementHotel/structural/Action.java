package managementHotel.structural;

import managementHotel.creat.Customer;

public interface Action {
    String TYPE_ROOM_1 = "SIMPLE";
    String TYPE_ROOM_2 = "DOUBLE";
    String TYPE_ROOM_3 = "LUXURY";
    double PRICE_ROOM_1 = 100d;
    double PRICE_ROOM_2 = 200d;
    double PRICE_ROOM_ = 300d;

    void add();

    Customer[] edit(Customer[] listCustomer, int id);

    Customer[] reMove(Customer[] listCustomer, int id);

    void showInfoCustomer();

    Customer inputInfoCus();

    void menu();

    double checkOut(int id);

}
