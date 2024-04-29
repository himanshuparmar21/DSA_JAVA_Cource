package Helper_Function;

import java.util.Scanner;

public class Input_Integer_Array {
    static int size = 0;
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " the Element:");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
