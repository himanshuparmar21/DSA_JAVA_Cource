package Helper_Function;

import java.util.Scanner;

public class Input_2D_Integer_Array {
    static int row_Size = 0;
    static int column_Size = 0;
    public static int[][] inputTwoDArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row And Column Size:");
        row_Size = sc.nextInt();
        column_Size = sc.nextInt();
        int[][] arr = new int[row_Size][column_Size];
        System.out.println("Enter Array Element");
        for (int i = 0; i < row_Size; i++) {
            for (int j = 0; j < column_Size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
}
