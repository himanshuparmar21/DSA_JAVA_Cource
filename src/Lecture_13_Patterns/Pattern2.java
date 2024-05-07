package Lecture_13_Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print("* ");
            }
            // When one line is printed, we need to add newline
            System.out.println();
        }
    }
}
