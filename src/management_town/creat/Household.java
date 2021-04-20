package management_town.creat;

import java.util.List;

public class Household {
    private String id_home;
    private List<Person> member;

    public Household() {
    }

    public Household(List<Person> member, String id_home) {
        this.member = member;
        this.id_home = id_home;
    }

    public List<Person> getMember() {
        return member;
    }

    public void setMember(List<Person> member) {
        this.member = member;
    }

    public String getId_home() {
        return id_home;
    }

    public void setId_home(String id_home) {
        this.id_home = id_home;
    }

    @Override
    public String toString() {
        return "Household{" +
                "id_home='" + id_home + '\'' +
                "member=" + member.toString() +
                '}';
    }
}
