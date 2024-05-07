package Lecture_13_Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        for (int row = 1; row <= 2 * n; row++) {
            int col = row > n ? 2*n - row : row;
            for (int space = 0; space < n - col; space++) {
                System.out.print("  ");
            }

            for (int i = col; i >= 1 ; i--) {
                System.out.print(i + " ");
            }
            for (int i = 2; i <= col; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
