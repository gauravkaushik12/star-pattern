package com.example.java.star;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the square value : ");
        int i, j, n = s.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == 1|| j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
