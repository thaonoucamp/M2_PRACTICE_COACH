package managementHotel.creat;

public class Person {
    private String name;
    private String birthday;
    private int id;

    public Person() {
    }

    public Person(String name, String birthday, int id) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name= " + name +
                ", birthday= " + birthday +
                ", id= " + id + ',';
    }
}
