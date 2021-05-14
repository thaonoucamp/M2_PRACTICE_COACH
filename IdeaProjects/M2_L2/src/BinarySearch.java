public class BinarySearch {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int binary(int[] arr, int find) {
        int head = 1;
        int tail = arr.length - 1;

        while (head >= tail) {
            int mid = (head + tail) / 2;
            if (find < arr[mid]) {
                head = mid - 1;
            } else if (find == arr[mid]) {
                return mid;
            } else {
                return tail = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int result = binary(arr, 6);
        System.out.println(result);
    }
}
