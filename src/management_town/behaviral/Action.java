package management_town.behaviral;

import management_town.creat.Household;

import java.util.List;

public interface Action<T> {
    int YEAR_CURRENT = 2021;

    Household inputHouse();

    void addHousehold(List<T> list);

    void editHousehold(List<T> list);

    void deleteHousehold(List<T> list);

    void sort(List<T> list);

    void findHousehold(List<T> list);

    void show(List<T> list);

    void menu();

    void checkHappy80(List<T> list);
}
