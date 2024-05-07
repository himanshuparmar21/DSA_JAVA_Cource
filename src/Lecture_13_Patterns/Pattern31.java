package Lecture_13_Patterns;

import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int temp = originalN - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(temp+ " ");
            }
            System.out.println();
        }
    }
}
