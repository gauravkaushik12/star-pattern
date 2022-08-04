package com.example.java.star;

import java.util.Scanner;

public class Star6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int row = s.nextInt(), i, j;
        for (i = 0; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = row - i; j > 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
