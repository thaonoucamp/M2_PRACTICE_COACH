package managementHotel.creat;

public class Customer extends Person {
    private int rentDay;
    private int TYPE_ROOM;

    public Customer() {
    }

    public Customer(int rentDay, int TYPE_ROOM) {
        this.rentDay = rentDay;
        this.TYPE_ROOM = TYPE_ROOM;
    }

    public Customer(String name, int id, String birthday, String address, int rentDay, int TYPE_ROOM) {
        super(name, id, birthday, address);
        this.rentDay = rentDay;
        this.TYPE_ROOM = TYPE_ROOM;
    }

    public int getRentDay() {
        return rentDay;
    }

    public void setRentDay(int rentDay) {
        this.rentDay = rentDay;
    }

    public int getTYPE_ROOM() {
        return TYPE_ROOM;
    }

    public void setTYPE_ROOM(int TYPE_ROOM) {
        this.TYPE_ROOM = TYPE_ROOM;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "rentDay=" + rentDay +
                ", TYPE_ROOM='" + TYPE_ROOM + '\'' +
                '}';
    }
}