package timgiatritrongmang;

import java.util.Scanner;

public class Timgiatritrongmang {
    public static void main(String[] args) {
        // Khai báo biến luu tên tìm kiếm và gán với giá trị nhập vào
        String[] students = {"Mến","Linh","Ngân","Hùng","Phát","Anh"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên sinh vien : ");
        String input_name = scanner.nextLine();

        // Duyệt mảng sinh viên đã khai báo ở trên và tìm phần tử có giá trị bằng với tên đã nhập
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }


    }
}

