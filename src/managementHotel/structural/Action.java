package managementHotel.structural;

import java.util.List;

public interface Action<T> {
    int SIMPLE = 100;
    int DOUBLE = 200;

    T inputInfo();

    List<T> add(List<T> t);

    List<T> edit(List<T> t);

    List<T> delete(List<T> t);

    List<T> sort(List<T> t);

    T find(List<T> t);

    List<T> checkOut(List<T> t);

    void show(List<T> t);


}