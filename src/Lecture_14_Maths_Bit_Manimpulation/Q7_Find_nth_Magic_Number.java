package Lecture_14_Maths_Bit_Manimpulation;

import java.util.Scanner;

public class Q7_Find_nth_Magic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        int ans = 0;
        int idx = 1;
        while(n > 0){
            int temp = n & 1;
            ans += (temp * (int) Math.pow(5,idx++));
            n=n>>1;
        }
        System.out.println(ans);
    }
}
