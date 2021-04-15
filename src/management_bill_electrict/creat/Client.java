package management_bill_electrict.creat;

public class Client {
    private String name;
    private int indexHome;
    private int oldIndex;
    private int newIndex;

    public Client() {
    }

    public Client(String name, int indexHome, int oldIndex, int newIndex) {
        this.name = name;
        this.indexHome = indexHome;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndexHome() {
        return indexHome;
    }

    public void setIndexHome(int indexHome) {
        this.indexHome = indexHome;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    @Override
    public String toString() {
        return "House_Hold{" +
                "name='" + name + '\'' +
                ", indexHome=" + indexHome +
                ", oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                '}';
    }
}
