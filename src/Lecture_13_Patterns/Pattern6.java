package Lecture_13_Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n - row - 1; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
