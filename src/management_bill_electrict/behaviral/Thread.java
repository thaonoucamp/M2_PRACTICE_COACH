package management_bill_electrict.behaviral;

import managementHotel.creat.Customer;
import management_bill_electrict.creat.Client;

public interface Thread {
    void menu();

    Client inputInfo();

    Client[] addClient(Client[] listClients);

    void showInfo(Client[] listClients);

    Client[] editInfo(Client[] listClients);

    Client[] deleteClient(Client[] listClients);

    Client[] sortClientByIdHome(Client[] clients);

    void culMoneyElectric(Client[] listClients);
}
