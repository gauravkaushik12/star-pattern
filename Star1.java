package com.example.java.star;
import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the line : ");
        int line = s.nextInt(),i,j;
        for (i = 0; i < line; i++) {
            for (j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//*
//* *
//* * *
