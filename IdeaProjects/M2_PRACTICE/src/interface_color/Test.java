package interface_color;

public class Test {
    public static void main(String[] args) {
        Square square = new Square();
        Square circle = new Square();
        Square triangle = new Square();
        Colorable[] colorables = {square, circle, triangle};
        for (Colorable colo :
                colorables) {
            if (colo instanceof Colorable) {
                colo.howToColor();
            }
        }
    }
}
