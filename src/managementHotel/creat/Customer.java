package managementHotel.creat;

public class Customer extends Person {

    private int dayRent;
    public double PRICE_ROOM = 150000d;

    public Customer() {
    }

    public Customer(int dayRent) {
        this.dayRent = dayRent;
    }

    public Customer(int dayRent, String typeRoom) {
        this.dayRent = dayRent;
    }

    public Customer(String name, String birthday, int id, int dayRent) {
        super(name, birthday, id);
        this.dayRent = dayRent;
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
                " dayRent= " + dayRent +
                "}";
    }
}
