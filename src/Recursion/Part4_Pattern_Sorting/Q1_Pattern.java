package Recursion.Part4_Pattern_Sorting;

import java.util.Scanner;

public class Q1_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        triangle(n,0);
        triangle1(n,0);
    }
    static void triangle(int r, int c){
        if(r == 0){
            return;
        }

        if(c < r){
            System.out.print("* ");
            triangle(r,c+1);
        }
        else{
            System.out.println();
            triangle(r-1,0);
        }
    }
    static void triangle1(int r, int c){
        if(r == 0){
            return;
        }

        if(c < r){
            triangle1(r,c+1);
            System.out.print("* ");
        }
        else{
            triangle1(r-1,0);
            System.out.println();
        }
    }
}
