package chuyen_doi_nhiet_do;

import java.util.Scanner;

public class Chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Menu.  \n");
            System.out.print("1. C to F \n");
            System.out.print("2. F to C \n");
            System.out.print("0. Exit \n");
            System.out.print(" Nhập vào số thứ tự cần chuyển ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập vào độ F :");
                    fahrenheit = input.nextDouble();
                    System.out.println("Đổi từ độ F -> C :" +fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhập vào độ C :");
                    celsius = input.nextDouble();
                    System.out.println("Đổi từ độ C sang độ F : "+celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);

            }
        }while (choice !=0);

    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9) *(fahrenheit - 32);
        return celsius;
    }
}
