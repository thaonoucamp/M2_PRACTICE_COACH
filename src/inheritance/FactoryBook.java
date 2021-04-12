package inheritance;

public abstract class FactoryBook {
    protected Behavior behavior;

    public FactoryBook(Behavior behavior) {
        this.behavior = behavior;
    }

    public FactoryBook() {

    }
}
