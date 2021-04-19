package management_library.creat;

public class Person {
    private String name;
    private String birthday;

    public Person() {
    }

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name.equals("") || name == null) {
            System.err.println("name is not empty !");
            return false;
        } else {
            this.name = name;
            return true;
        }
    }


    public String getBirthday() {
        return birthday;
    }

    public boolean setBirthday(String birthday) {
        if (birthday.equals("") || birthday == null) {
            System.err.println("name is not empty !");
            return false;
        } else {
            this.birthday = name;
            return true;
        }
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", birthday='" + birthday + '\''
                ;
    }
}
