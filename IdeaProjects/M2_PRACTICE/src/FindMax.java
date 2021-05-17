public class FindMax {
    static int[] arr = {2, -1, 4, 6, 7, -8, 0, 3, -5, 9};

    public static void findMaxAm(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int max;
            if (arr[i] < 0) {
                max = arr[i];
                if (arr[i] > max && arr[i] < 0) {
                    arr[i] = max;
                }
                System.out.println(max);
            }
        }
    }

    public static void main(String[] args) {
//        testFindMaxNum();
//        findMaxNum(arr);
        findMaxAm(arr);
    }
}
