package Lecture_14_Maths_Bit_Manimpulation;

import java.util.Scanner;

public class Q3_Find_ith_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bit:");
        int n = sc.nextInt();

        System.out.print("Enter ith Index:");
        int idx = sc.nextInt();

        System.out.println((n & (1 << idx)));
    }
}

//Basically means Find ith bit

//Ex.:100011
//  & 001000 [ 1 << 4 => 1000]
//-----------
//    101011