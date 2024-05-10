package Lecture_14_Maths_Bit_Manimpulation;

import java.util.Scanner;

public class Q8_Find_Number_Of_Digits_in_BaseB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        System.out.println(Method1(n));

//        Find Using Formula
//        Number of digit in base b of number n => (int) (logbn) + 1 {Where b is base nad n in number}
//        int ans = (int)(Math.log(n) / Math.log(10)) + 1; //for Use Decimal Number
        int ans = (int)(Math.log(n) / Math.log(2)) + 1; //for Use Binary Number
//        logba = logxa/logxb
        System.out.println(ans);
    }
    static int Method1(int n){
        int count = 0;
        while(n > 0){
            count++;
            n>>=1;
        }
        return count;
    }
}

//Ex.: 6 => 110 => Answer:3(bcz in binary total 3 digit)