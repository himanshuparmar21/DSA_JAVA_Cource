package Lecture_14_Maths_Bit_Manimpulation;

import java.util.Scanner;

public class Q14_XOR_OF_Between_Two_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int b = sc.nextInt();

        int ans = XOR(b) ^ XOR(a-1);
        System.out.println(ans);


        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);
    }
    static int XOR(int n){
        if(n % 4 == 0){
            return n;
        }else if(n % 4 == 1){
            return 1;
        } else if(n % 4 == 2){
            return n+1;
        }
        return 0;
    }
}
