package demo_assert;

public class DemoSelect {
    static int[] arr = {1, 9, 5, 6, 7, 4, 3, 2, 8};

    public static void sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
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
