package management_library.creat;

public class Student extends Person {
    private String _class;
    private int codeCard;
    private String nameBook;
    private int borrowDay;
    private int returnDay;

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public int getCodeCard() {
        return codeCard;
    }

    public void setCodeCard(int codeCard) {
        this.codeCard = codeCard;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getBorrowDay() {
        return borrowDay;
    }

    public void setBorrowDay(int borrowDay) {
        this.borrowDay = borrowDay;
    }

    public int getReturnDay() {
        return returnDay;
    }

    public void setReturnDay(int returnDay) {
        this.returnDay = returnDay;
    }

    public Student() {
    }

    public Student(String _class, int codeCard, String nameBook, int borrowDay, int returnDay) {
        this._class = _class;
        this.codeCard = codeCard;
        this.nameBook = nameBook;
        this.borrowDay = borrowDay;
        this.returnDay = returnDay;
    }

    public Student(String name, String birthday, String _class, int codeCard, String nameBook, int borrowDay, int returnDay) {
        super(name, birthday);
        this._class = _class;
        this.codeCard = codeCard;
        this.nameBook = nameBook;
        this.borrowDay = borrowDay;
        this.returnDay = returnDay;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ", _class='" + _class + '\'' +
                ", codeCard='" + codeCard + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", borrowDay=" + borrowDay + '\'' +
                ", returnDay=" + returnDay + '\'' +
                '}';
    }
}

