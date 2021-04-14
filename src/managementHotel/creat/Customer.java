package managementHotel.creat;

public class Customer extends Person {

    private int dayRent;
    private String typeRoom;

    public Customer() {
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public Customer(int dayRent) {
        this.dayRent = dayRent;
    }

    public Customer(int dayRent, String typeRoom) {
        this.dayRent = dayRent;
        this.typeRoom = typeRoom;
    }

    public Customer(String name, String birthday, int id, int dayRent, String typeRoom) {
        super(name, birthday, id);
        this.dayRent = dayRent;
        this.typeRoom = typeRoom;
    }

    public int getDayRent() {
        return dayRent;
    }

    public void setDayRent(int dayRent) {
        this.dayRent = dayRent;
    }

    @Override
    public String toString() {
        return super.toString() +
                " dayRent=" + dayRent +
                "}";
    }
}
