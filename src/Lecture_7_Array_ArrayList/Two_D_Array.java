package Lecture_7_Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        //Input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int a[] : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
//Syntax Data_Type[][] Variable_name = new Data_Type[row_size][colum_size];
//in 2D array Row Size in Mandatory but Column size is not mandatory