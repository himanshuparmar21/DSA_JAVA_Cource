package Recursion.Part2;

import java.util.Scanner;

public class Q2_Print_1ToN_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = sc.nextInt();

        printNum(n);
    }
    static void printNum(int n){
        if(n < 1){
            return;
        }
        printNum(n - 1);
        System.out.print(n + " ");
    }
}
