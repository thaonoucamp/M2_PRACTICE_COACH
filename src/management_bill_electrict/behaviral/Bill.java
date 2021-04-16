package management_bill_electrict.behaviral;

import management_bill_electrict.creat.Client;

import java.util.Scanner;

public class Bill implements Thread {
    Scanner sc = new Scanner(System.in);
    Client[] listClients = new Client[0];

    @Override
    public void menu() {
        int choice;
        do {
            System.out.println("MENU : " +
                    "\n1. Add the client." +
                    "\n2. Edit the info client." +
                    "\n3. Delete the client." +
                    "\n4. Sort the client list." +
                    "\n5. Calculator the electric bill of client." +
                    "\n6. Exit.");
            System.out.println("Enter your choice :");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addClient(listClients);
                    System.out.println("List clients after add :");
                    showInfo(listClients);
                    break;
                case 2:
                    listClients = editInfo(listClients);
                    System.out.println("List clients after edit :");
                    showInfo(listClients);
                    break;
                case 3:
                    listClients = deleteClient(listClients);
                    System.out.println("List clients after delete :");
                    showInfo(listClients);
                    break;
                case 4:
                    listClients = sortClientByIdHome(listClients);
                    System.out.println("List after sort :");
                    showInfo(listClients);
                    break;
                case 5:
                    culMoneyElectric(listClients);
                    break;
                case 6:
                    System.out.println("SEE YOU LATER...THANKS !");
                    System.exit(6);
            }
        } while (true);
    }

    @Override
    public Client inputInfo() {
        Client infoClient = new Client();

        System.out.println("Enter client's name :");
        infoClient.setName(sc.nextLine());

        System.out.println("Enter client's name :");
        infoClient.setIndexHome(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter client's name :");
        infoClient.setOldIndex(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter client's name :");
        infoClient.setNewIndex(Integer.parseInt(sc.nextLine()));

        return infoClient;
    }

    @Override
    public Client[] addClient(Client[] list) {
        Client[] newListClient = new Client[listClients.length + 1];

        for (int i = 0; i < listClients.length; i++) {
            System.out.println("Enter client the index : " + (i + 1));
            inputInfo();
            newListClient[i] = listClients[i];
        }
        return newListClient;
    }

    @Override
    public void showInfo(Client[] listClients) {
        for (Client client :
                listClients) {
            System.out.println(client);
        }
    }

    @Override
    public Client[] editInfo(Client[] listClients) {
        System.out.println("Enter the id of client want edit :");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < listClients.length; i++) {
            if (listClients[i].getIndexHome() == id) {
                listClients[i] = inputInfo();
            }
        }
        System.out.println("List clients after edit :");
        return new Client[0];
    }

    @Override
    public Client[] deleteClient(Client[] listClients) {
        System.out.println("Enter the id of client want edit :");
        int id = Integer.parseInt(sc.nextLine());

        Client[] newListClient = new Client[listClients.length - 1];

        for (int i = 0; i < listClients.length; i++) {
            if (listClients[i].getIndexHome() == id) {
                for (int j = i; j < listClients.length - 1; j++) {
                    i = i + 1;
                }
            }
            newListClient[i] = listClients[i];
        }
        return newListClient;
    }

    @Override
    public Client[] sortClientByIdHome(Client[] clients) {
        for (int i = 0; i < clients.length; i++) {
            Client temp;
            for (int j = i; j < clients.length - 1; j++) {
                if (clients[i].getIndexHome() < clients[j + 1].getNewIndex()) {
                    temp = clients[j + 1];
                    clients[j + 1] = clients[i];
                    clients[i] = temp;
                }
            }
        }
        return clients;
    }

    @Override
    public void culMoneyElectric(Client[] listClients) {
        double total;
        System.out.println("Enter number home want to calculator money :");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < listClients.length; i++) {
            if (listClients[i].getIndexHome() == id) {
                total = (listClients[i].getNewIndex() - listClients[i].getOldIndex()) * 750;
                System.out.println("Bill need have to pay of household " + listClients[i].getName() + " is " + total);
            }
        }
    }
}
