package demo_assert;

public class Bubble {
    static int[] arr = {2, 4, 6, 8, 9, 7, 5, 3, 1};

    public static void sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        sorting(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
