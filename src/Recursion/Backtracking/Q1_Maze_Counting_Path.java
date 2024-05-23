package Recursion.Backtracking;

import java.util.Scanner;

public class Q1_Maze_Counting_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row And Column:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println(count(row,col));
    }
    static int count(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }

        return count(r-1,c) + count(r,c-1);
    }
}
