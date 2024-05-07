package Lecture_13_Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();

        for (int row = 0; row <= 2 * n; row++) {
//            if(row > n){
//                for (int col = 0; col < (2*n - row); col++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            else{
//                for (int col = 0; col < row; col++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
            int col = row > n ? 2*n - row : row;
            for (int column = 0; column < col; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
