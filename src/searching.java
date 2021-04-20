class Searching {

    public boolean checkNumber(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int x;
        int[] arr = {1, 3, 5, 2, 4, 6, 7, 9};
        Searching searching = new Searching();
        boolean check = searching.checkNumber(arr, 9);
        System.out.println(check);
    }
}
// tìm kiếm 1 số có trong mảng hay ko;
// 1. cho 1 số nhập vào từ bàn phím
// dùng vòng lặp for duyệt mảng
// n