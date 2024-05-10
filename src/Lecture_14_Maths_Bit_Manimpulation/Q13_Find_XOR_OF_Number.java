package Lecture_14_Maths_Bit_Manimpulation;

import java.util.Scanner;

public class Q13_Find_XOR_OF_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        if(n % 4 == 0){
            System.out.println(n);
        }else if(n % 4 == 1){
            System.out.println(1);
        } else if(n % 4 == 2){
            System.out.println(n+1);
        } else if(n % 4 == 3){
            System.out.println(0);
        }

        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans ^= i;
        }
        System.out.println(ans);
    }
}
