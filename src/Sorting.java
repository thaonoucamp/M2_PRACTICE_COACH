public class Sorting {
    public static void show(int[] arr) {
        for (int i :
                arr) {
            System.out.println(i);
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int position = i;
            int temp = arr[position];
            while (position > 0 && arr[position - 1] > temp) {
                arr[position] = arr[position - 1];
                position--;
            }
            arr[position] = temp;
        }
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = list[min];
                list[min] = list[i];
                list[i] = temp;
            }
        }
    }

    public static void bubbleSort(int[] arrays) {
        for (int j = 0; j < arrays.length; j++) {
            for (int i = arrays.length - 1; i > j; i--) {
                if (arrays[i] < arrays[i - 1]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[i - 1];
                    arrays[i - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 9, 6, -8, 4, 0};
//        bubbleSort(array);
//        selectionSort(array);
        insertSort(array);
        show(array);
    }
}
