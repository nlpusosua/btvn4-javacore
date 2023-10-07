package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String select;
////bai2
//        do {
//            System.out.println("Vui lòng nhập tên sinh viên:");
//            String name = scanner.nextLine();
//            System.out.println("Vui lòng nhập địa chỉ sinh viên:");
//            String add = scanner.nextLine();
//            System.out.println("Vui lòng nhập tuổi sinh viên:");
//            int age = Integer.parseInt(scanner.nextLine());
////            chỗ lưu thông tin
//            String info = "Tên: "+name+", "+"Địa Chỉ: "+add+", "+"Tuổi: "+age;
//            System.out.println("Thông tin sinh viên: "+info);
//            System.out.println("Bạn có muốn dk lại không>(Y/N)");
//            select = scanner.nextLine();
//        } while (select.equalsIgnoreCase("Y"));

//        bài 1 Cách 1
//        int sum=0;
//        do {
//            System.out.println("nhập vào một số nguyên:");
//            int n = Integer.parseInt(scanner.nextLine());
//            System.out.println("bạn có muốn tiếp tục nhập không?(Y/N)");
//            select= scanner.nextLine();
//            sum+=n;
//        } while (select.equalsIgnoreCase("Y"));
//        System.out.println("Tổng các số bạn vừa nhập vào là "+sum);

//        bài 1 cách 2
        System.out.println("nhập vào một số nguyên:");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("bạn có muốn tiếp tục nhập không ?(Y/N)");
        select= scanner.nextLine();
        int sum;
        sum =+ n;
        while (select.equalsIgnoreCase("Y")) {
            System.out.println("nhập vào một số nguyên");
            n = Integer.parseInt(scanner.nextLine());
            System.out.println("bạn có muốn tiếp tục nhập không(Y/N)");
            select= scanner.nextLine();
            sum+=n;
        }
        System.out.println("Tổng các số bạn vừa nhập vào = "+sum);


    }
}
