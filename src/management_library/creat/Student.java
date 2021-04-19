package management_library.creat;

public class Student extends Person {
    private String _class;
    private String codeCard;
    private String nameBook;
    private String borrowDay;
    private String returnDay;

    public String get_class() {
        return _class;
    }

    public boolean set_class(String _class) {
        if (_class.equals("")) {
            System.err.println("Class is not empty !");
            return false;
        } else {
            this._class = _class;
            return true;
        }
    }

    public String getCodeCard() {
        return codeCard;
    }

    public boolean setCodeCard(String codeCard) {
        if (codeCard.equals("")) {
            System.err.println("Enter value for code card :");
            return false;
        } else {
            this.codeCard = codeCard;
            return true;
        }
    }

    public String getNameBook() {
        return nameBook;
    }

    public boolean setNameBook(String nameBook) {
        if (nameBook != "") {
            this.nameBook = nameBook;
            return true;
        } else {
            System.err.println("Enter the value for name book !");
            return false;
        }
    }

    public String getBorrowDay() {
        return borrowDay;
    }

    public boolean setBorrowDay(String borrowDay) {
        if (borrowDay.equals("")) {
            System.err.println("Enter the borrow day !");
            return false;
        } else {
            this.borrowDay = borrowDay;
            return true;
        }
    }

    public String getReturnDay() {
        return returnDay;
    }

    public boolean setReturnDay(String returnDay) {
        if (returnDay.equals("")) {
            System.err.println("Enter the return book day !");
            return false;
        } else {
            this.returnDay = returnDay;
            return true;
        }
    }

    public Student() {
    }

    public Student(String _class, String codeCard, String nameBook, String borrowDay, String returnDay) {
        this._class = _class;
        this.codeCard = codeCard;
        this.nameBook = nameBook;
        this.borrowDay = borrowDay;
        this.returnDay = returnDay;
    }

    public Student(String name, String birthday, String _class, String codeCard, String nameBook, String borrowDay, String returnDay) {
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
                ", borrowDay='" + borrowDay + '\'' +
                ", returnDay='" + returnDay + '\'' +
                '}';
    }
}

