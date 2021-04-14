package managementHotel.creat;

public class Customer extends Person{
    private int dayRent;

    public Customer() {
    }

    public Customer(int dayRent) {
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
        return "Customer{" +
                super.toString()+
                " dayRent=" + dayRent +
                '}';
    }
}
