package Recursion.Part2;

import java.util.Scanner;

public class Q5_Sum_Of_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = sc.nextInt();

        System.out.println("Sum Of Digit is : "+ sum(n));
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + sum(n / 10);
    }
}
