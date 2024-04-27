package Lecture_4_Loop_Condition;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();

        int temp = 0;

        while(num>0){
            int rem = num % 10;
            temp = (temp * 10) + rem;
            num/=10;
        }
        System.out.println(temp);
    }
}
