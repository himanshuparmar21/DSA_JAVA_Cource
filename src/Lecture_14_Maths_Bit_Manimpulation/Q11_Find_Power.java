package Lecture_14_Maths_Bit_Manimpulation;

import java.util.Scanner;

public class Q11_Find_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base:");
        int base = sc.nextInt();
        System.out.print("Enter Power:");
        int power = sc.nextInt();

        int ans = 1;
        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }

            base *= base;
            power >>= 1;
        }
        System.out.println(ans);
    }
}
