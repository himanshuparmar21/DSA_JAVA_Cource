package Lecture_7_Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Array " + i + " The element:");
            arr[i] = sc.nextInt();
        }

        //Print Using For Loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Print Using Arrays.toString(Array_Variable_name)
        System.out.println(Arrays.toString(arr));

        //Print Using enhance for loop(Not Using Index) (for each Loop)
        for (int j : arr) {
            System.out.print(j + " "); //Here j is represent element of array
        }

//        System.out.println(arr[9999]); //index greater than Size then show error(ArrayIndexOutOfRange)
    }
}

//if print element that out of length then show exception