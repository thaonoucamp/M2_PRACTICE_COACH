import java.util.Arrays;

public class Add {
    static int[] arr = {1, 2, 3, 4, 5, 0};

    public static void addFirstNum(int[] arr, int x) {
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = x;
    }

    public static int[] addRandom(int[] arr, int k, int x) {
        for (int i = arr.length - 2; i >= k; i--) {
            if (k < 0 || k > arr.length) {
                System.out.println("Vi tri khong hop le");
            }
            arr[i + 1] = arr[i];
            arr[k] = x;
        }
        return arr;
    }

    public static int[] removeItem(int[] arr, int k) {
        if (k < 0 || k > arr.length) {
            System.err.println("Vi tri khong hop le");
        }
        for (int i = k; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        //dd.addFirstNum(arr, 6);
        //addRandom(arr, 5, 9);
        removeItem(arr, 4);
        for (int a :
                arr) {
            System.out.println(a);
        }
    }
}
