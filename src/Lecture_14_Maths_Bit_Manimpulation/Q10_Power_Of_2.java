package Lecture_14_Maths_Bit_Manimpulation;

import java.util.Scanner;

public class Q10_Power_Of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}


// 100(4) => 11(3)+ 01(1)
// 4 & (3) => 0
// 100
//&011
//=000