package staff.behaviral;

public interface IManager<E> {
    E input();

    void add(E[] e);

    void edit(E[] e);

    void delete(E[] e);

    void find(E[] e);

    void sort(E[] e);

    void show(E[] e);
}
