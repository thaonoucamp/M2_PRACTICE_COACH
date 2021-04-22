package management_town.behaviral;

import management_town.creat.Household;
import management_town.creat.Person;

import java.util.*;

public class ManagementTown implements Action<Household> {
    Scanner sc = new Scanner(System.in);

    List<Household> householdList = new ArrayList<>();

    @Override
    public Household inputHouse() {
        Household newHousehold = new Household();

        System.out.println("Enter id home");
        newHousehold.setId_home(sc.nextLine());

        newHousehold.setMember(addMember());

        return newHousehold;
    }

    @Override
    public void addHousehold(List<Household> list) {
        System.out.println("Enter quantity household want to add");
        int quantity = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Enter index household " + i);
            list.add(inputHouse());
        }

        System.out.println("List after add--->");
        show(list);
    }

    @Override
    public void editHousehold(List<Household> list) {
        list.set(checkIndex(list), inputHouse());
        show(list);
    }

    @Override
    public void deleteHousehold(List<Household> list) {
        list.remove(checkIndex(list));
        show(list);
    }

    @Override
    public void sort(List<Household> list) {
        list.sort((o1, o2) -> {
            if (o1.getId_home().compareTo(o2.getId_home()) > 0) {
                return 1;
            } else {
                return -1;
            }
        });
    }

    @Override
    public void findHousehold(List<Household> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(checkIndex(list)));
        }
    }

    @Override
    public void show(List<Household> list) {
        for (Household h :
                list) {
            System.out.println(h);
        }

        sort(list);
    }

    @Override
    public void menu() {
        int choice;
        do {
            System.out.println("Menu :" +
                    "\n1. ADD" +
                    "\n2. EDIT" +
                    "\n3. DELETE" +
                    "\n4. FIND" +
                    "\n5. EDIT_MEMBER" +
                    "\n6. DELETE_MEMBER" +
                    "\n7. CHECK_HAPPY_80" +
                    "\n8. EXIT" +
                    "\nenter your choice !"
            );
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addHousehold(householdList);
                    break;
                case 2:
                    editHousehold(householdList);
                    break;
                case 3:
                    deleteHousehold(householdList);
                    break;
                case 4:
                    findHousehold(householdList);
                    break;
                case 5:
                    editInfoMember(householdList);
                    break;
                case 6:
                    deleteMember(householdList);
                    break;
                case 7:
                    checkHappy80(householdList);
                    break;
                case 8:
                    System.exit(8);
            }
        } while (choice != 8);
    }

    @Override
    public void checkHappy80(List<Household> list) {
        int checkAge;

        for (int i = 0; i < list.size(); i++) {
            String ageOver80 = list.get(i).getMember().get(i).getBirthday().split("-")[list.size() - 1];
            checkAge = YEAR_CURRENT - Integer.parseInt(ageOver80);
            if (checkAge >= 80) {
                System.out.println(list.get(i).getMember().toString());
            }
        }
    }

    public int checkIndex(List<Household> list) {
        int index;
        System.out.println("Enter id home ");
        String findIndex = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId_home().equals(findIndex)) {
                index = i;
                return index;
            }
        }
        System.err.println("Find not household in town");
        return -1;
    }

    public Person inputInfoMember() {
        Person member = new Person();

        System.out.println("Enter the name");
        member.setName(sc.nextLine());

        System.out.println("Enter the birthday");
        member.setBirthday(sc.nextLine());

        System.out.println("Enter the job");
        member.setJob(sc.nextLine());

        return member;
    }

    public List<Person> addMember() {
        List<Person> listMember = new ArrayList<>();

        System.out.println("Enter quantity member");
        int quantity = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter member index " + (i + 1));
            listMember.add(inputInfoMember());
        }
        return listMember;
    }

    public void editInfoMember(List<Household> list) {
        System.out.println("Enter the name want to edit");
        String name = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).getMember().size(); j++) {
                if (list.get(i).getMember().get(j).getName().equals(name)) {
                    list.get(i).getMember().set(j, inputInfoMember());
                }
            }
        }
        show(list);
    }

    public void deleteMember(List<Household> list) {
        System.out.println("Enter the name want to delete");
        String name = sc.nextLine();
        for (Household h :
                list) {
            for (Person p :
                    h.getMember()) {
                if (p.getName().equals(name)) {
                    h.getMember().remove(p);
                    break;
                }
            }
        }
        show(list);
    }
}
