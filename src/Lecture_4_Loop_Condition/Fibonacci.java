package Lecture_4_Loop_Condition;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = a + b;
        for (int i = 2; i < num; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(c);
    }
}
