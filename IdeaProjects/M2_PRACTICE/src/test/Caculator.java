package test;

public class Caculator {
    public static int add(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        Caculator.add(4, 5);
        Caculator.add(0, 0);
        Caculator.add(0, 1);
        Caculator.add(1, 1);
        Caculator.add(1, 0);
    }
}
