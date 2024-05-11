package Lecture_15_Maths_Part_2;

import java.util.Scanner;

public class Q1_Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if(n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
