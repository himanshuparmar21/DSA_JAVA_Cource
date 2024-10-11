import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
//        for (char[] chars : board) {
//            Arrays.fill(chars, ' ');
//        }
        Scanner sc = new Scanner(System.in);

        char player = 'X';
        boolean isWon = false;

        while (!isWon){
            printBoard(board);
            System.out.print("Player " + player + " Enter:");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(board[row][col] == ' '){
                board[row][col] = player;
                isWon = check(board,player);
                if(isWon){
                    System.out.println("Player " + player + " Won.");
                }else {
                    player = player == 'X' ? 'O' : 'X' ;
                }
            }else{
                System.out.println("Invalid Move. Try Again!!");
            }
        }
        printBoard(board);
    }

    public static boolean check(char[][] board, char player) {

        // For Row
        for (int row = 0; row < board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player) return true;
        }

        // For Column
        for (int col = 0; col < board.length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player) return true;
        }

        // For Diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;

        return false;
    }

    public static void printBoard(char[][] board){
        for (char[] row : board){
            System.out.print("| ");
            for (char col : row){
                System.out.print(col + " | ");
            }
            System.out.println();
        }
    }
}