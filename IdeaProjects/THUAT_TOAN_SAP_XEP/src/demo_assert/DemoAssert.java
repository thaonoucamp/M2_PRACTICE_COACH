package demo_assert;

public class DemoAssert {
    static int[] arr = {2, 9, 5, 4, 8, 1, 6, 3, 7};

    public static void sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           int current = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > current; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        sorting(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
