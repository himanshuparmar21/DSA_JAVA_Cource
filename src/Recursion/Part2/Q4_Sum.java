package Recursion.Part2;

import java.util.Scanner;

public class Q4_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = sc.nextInt();

        System.out.println("Sum Of " + n + " To 1 :"+ sum(n));
    }
    static int sum(int n){
        if(n <= 1){
            return 1;
        }
        return n + sum(n - 1);
    }
}
