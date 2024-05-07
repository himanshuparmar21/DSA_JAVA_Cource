package Lecture_13_Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
            for (int space = row; space > 0; space--) {
                System.out.print("  ");
            }
            for (int col = row; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
