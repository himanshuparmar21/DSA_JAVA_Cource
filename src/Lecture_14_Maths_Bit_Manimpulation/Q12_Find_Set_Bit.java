package Lecture_14_Maths_Bit_Manimpulation;

import java.util.Scanner;

public class Q12_Find_Set_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

//        System.out.println(Method1(n));

//        Method 2
        int count = 0;
        while(n > 0){
            count++;
//            n -= (n & -n);
             n = n & (n-1);
        }
        System.out.println(count);
    }
    static int Method1(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}

//In this Q. Find Set bit means Find How many 1 available in given number
//Ex.:7 => (111) => Answer:3