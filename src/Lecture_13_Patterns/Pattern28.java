package Lecture_13_Patterns;

import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        for (int row = 0; row <= 2 * n; row++) {
            int col = row > n ? 2*n - row : row;
            int space = n - col;
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int column = 0; column < col; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
