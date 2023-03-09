package reverseArray;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        //Khai báo các biến , nhập và kiểm tra kích thuoức của chúng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số size ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước không vượt quá 20");
        } while (size > 20);
        //Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập vào số phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        //In ra mảng đã nhập
        System.out.printf("%-20s%s", "In ra phần tử của mảng ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");

        }
        // Đảo ngược các phần tu trong mảng
        // Dùng biến trung gian để hoán đổi giá trị giữa 2 phần tử
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        // In ra mảng sau khi đã đảo ngược thứ tự của các mảng
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }


    }
}




