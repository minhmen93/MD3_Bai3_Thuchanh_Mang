package dem_so_luong_sinh_vien_thi_do;

import java.util.Scanner;

public class Dem_so_luong_sinh_vien_thi_do {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(" Tổng số sinh viên :");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Số lượng sinh viên không vượt quá 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print(" Nhập điểm cho học sinh " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Danh sách điểm: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n Số lượng học sinh thi đỗ " + count);

    }
}
