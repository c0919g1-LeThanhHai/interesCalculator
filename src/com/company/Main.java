package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double money;
        int month;
        float interes_rate;
        System.out.print("Nhập vào số tiền vay:");
        money = scanner.nextDouble();
        System.out.print("Nhập vào số tháng vay: ");
        month = scanner.nextInt();
        System.out.print("Nhập lãi xuất hàng năm: ");
        interes_rate = scanner.nextFloat();

        double totalInteres = 0;
        for(int i=0; i<month; i++) {
            totalInteres = money * (interes_rate / 100) / 12 * 3;
        }

        System.out.printf("Tổng tiền lãi là %4.2f", totalInteres);
    }
}
