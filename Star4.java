package com.example.java.star;
import java.util.Scanner;

public class Star4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int row = s.nextInt(),i,j;
        for(i=0;i<row;i++){
            for(j=row-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
