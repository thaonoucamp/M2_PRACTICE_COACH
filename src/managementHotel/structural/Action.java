package managementHotel.structural;

import managementHotel.creat.Customer;

public interface Action {

    Customer[] add(Customer[] listCustomer);

    Customer[] edit(Customer[] listCustomer);

    Customer[] reMove(Customer[] listCustomer);

    void showInfoCustomer();

    Customer inputInfoCus();

    void menu();

    Customer[] sortIdCustomer(Customer[] listCustomer);

    Customer[] checkOut(Customer[] listCustomer);

}
