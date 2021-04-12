package inheritance;

public class FictionBook extends Book{
    private String category;

    public FictionBook(Behavior behavior, String bookCode, String name, double price, String author) {
        super(behavior, bookCode, name, price, author);
    }

    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public FictionBook(Behavior behavior) {
        super(behavior);
    }

    public FictionBook() {
    }

    public FictionBook(Behavior behavior, String bookCode, String name, double price, String author, String category) {
        super(behavior, bookCode, name, price, author);
        this.category = category;
    }

    public FictionBook(Behavior behavior, String category) {
        super(behavior);
        this.category = category;
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +super.toString()+
                "category='" + category + '\'' +
                '}';
    }
}
