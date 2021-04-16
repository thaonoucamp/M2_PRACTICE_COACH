package managementHotel.creat;

public class Person {
    private String name;
    private int id;
    private String birthday;
    private String address;

    public Person() {
    }

    public Person(String name, int id, String birthday, String address) {
        this.name = name;
        this.id = id;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", id=" + id +
                        ", birthday='" + birthday + '\'' +
                        ", address='" + address + '\'';
    }
}