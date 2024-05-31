package Recursion.Backtracking;

import java.util.Scanner;

public class Q8_NKnight_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n];
        knight(board,0,0,n);
    }
    static void knight(boolean[][] board,int row,int col,int knights){
        if(knights == 0){
            display(board);
            System.out.println();
            return;
        }

        if(row == board.length - 1 && col == board.length){
            return;
        }
        if(col == board.length){
            knight(board,row+1,0,knights);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col] = true;
            knight(board,row,col+1,knights-1);
            board[row][col] = false;
        }

        knight(board,row,col+1,knights);
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean[][] board,int row,int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }
    static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean ele : row){
                if(ele){
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
