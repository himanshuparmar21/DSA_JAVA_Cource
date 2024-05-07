package Lecture_13_Patterns;

import java.util.Scanner;

public class pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for (int i = row; i >= 1 ; i--) {
                System.out.print(i + " ");
            }
            for (int i = 2; i <= row; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
