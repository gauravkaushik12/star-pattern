package com.example.java.star;

import java.util.Scanner;

public class Star3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int row = s.nextInt(), i, j, star = 1;
        for (i = 0; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print("  ");
            }
            for (j = 0; j < star; j++) {
                System.out.print("* ");
            }
            star += 2;
            System.out.println();
        }
    }
}
//    *
//  * * *
//* * * * *