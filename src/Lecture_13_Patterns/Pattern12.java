package Lecture_13_Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        for (int row = 0; row < 2*n; row++) {
            int temp = row > n? 2*n - row: row;
            int column = row > n ? row - n: n - row;
            for (int space = 0; space < temp; space++) {
                System.out.print(" ");
            }
            for (int col = column; col > 0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
