package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {9, 10, 11, 12, 13, 14}
        };

        int maxCot = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            if (maxCot < arr[i].length) {
                maxCot = arr[i].length;
            }
        }

        System.out.println("Bạn muốn tính tổng cột mấy: ");
        int number = scanner.nextInt();
        int total = 0;
        if (number < 0 || number >= maxCot) {
            System.out.println("Không có cột " + number + " trong mảng");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length <= number) {
                    continue;
                } else {
                    total += arr[i][number];
                }
            }
            System.out.println("Tổng của cột thứ " + number + " là: " + total);
        }
    }
}
