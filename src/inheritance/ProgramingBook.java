package inheritance;

public class ProgramingBook extends Book{
    private String language;
    private String framework;

    public ProgramingBook() {
    }

    public ProgramingBook(String bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public ProgramingBook(Behavior behavior, String bookCode, String name, double price, String author, String language, String framework) {
        super(behavior, bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public ProgramingBook(Behavior behavior, String language, String framework) {
        super(behavior);
        this.language = language;
        this.framework = framework;
    }

    public ProgramingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgramingBook{" + super.toString()+
                " language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                '}';
    }
}
