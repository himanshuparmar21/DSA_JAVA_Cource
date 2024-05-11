package Lecture_15_Maths_Part_2;

import java.util.Scanner;

public class Q2_Seive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        boolean[] arr = new boolean[n+1];
        seive(n,arr);
    }
    //False in arr means number is prime
    static void seive(int n,boolean[] arr){
        for (int i = 2; i * i <= n; i++) {
            if(!arr[i]){
                for (int j = i*2; j <= n; j+=i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if(!arr[i]){
                System.out.print(i + " ");
            }
        }
    }
}
