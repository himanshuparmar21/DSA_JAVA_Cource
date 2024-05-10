package Lecture_14_Maths_Bit_Manimpulation;

import java.util.Scanner;

public class Q4_Set_ith_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bit:");
        int n = sc.nextInt();

        System.out.print("Enter ith Index:");
        int idx = sc.nextInt();

        System.out.println((n | (1 << idx)));
    }
}


//Basically meas if it's 0 then Change 1 if it's 1 then remain 1
// 0 => 1
// 1 => 1

//Ex.:100011
//  | 001000 [ 1 << 4 => 1000]
//-----------
//    101011