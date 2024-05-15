package Recursion.Part2;

import java.util.Scanner;

public class Q3_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = sc.nextInt();

        System.out.println("Factorial Of " + n + " :"+fact(n));
    }
    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
