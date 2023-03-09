package gia_tri_nho_nhat_trong_mang;

public class Gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        int[] arr = {14, 3, 4, 15, 6, 7, 9, 2, 1, 5, 6};
        int index = minValue(arr);
        System.out.println(" In ra giá trị nhỏ nhất của mảng :" + arr[index]);

    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length ; i++) {
            if (array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
