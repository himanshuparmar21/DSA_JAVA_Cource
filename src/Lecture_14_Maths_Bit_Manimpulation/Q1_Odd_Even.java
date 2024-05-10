package Lecture_14_Maths_Bit_Manimpulation;

import java.util.Scanner;

public class Q1_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();

        if((n & 1 )== 1){
            System.out.println("Number is Odd");
        }else{
            System.out.println("Number is Even");
        }
    }
}
