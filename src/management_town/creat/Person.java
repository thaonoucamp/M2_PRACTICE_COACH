package management_town.creat;

public class Person {
    private String name;
    private String birthday;
    private String job;

    public Person() {
    }

    public Person(String name, String birthday, String job) {
        this.name = name;
        this.birthday = birthday;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", job='" + job + '\'';
    }
}
