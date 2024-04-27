package Lecture_3_First_JAVA_Program;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number:");
        int num2 = sc.nextInt();

        System.out.println("Sum of " + num1 + " and " + num2 +" is:" + (num1 + num2));
    }
}
