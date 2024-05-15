package Recursion.Part2;

import java.util.Scanner;

public class Q6_Product_Of_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = sc.nextInt();

        System.out.println("Sum Of Digit is : "+ prod(n));
    }
    static int prod(int n){
        if(n%10 == n){
            return n;
        }
        return (n % 10) * prod(n / 10);
    }
}
