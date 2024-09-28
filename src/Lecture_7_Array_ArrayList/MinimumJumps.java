package Lecture_7_Array_ArrayList;
// https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
public class MinimumJumps {
    public static void main(String[] args) {
        System.out.println(minJumps(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
    }
    public static int minJumps(int[] arr) {
        int n = arr.length;
        if(n == 1) return 0;
        if(arr[0] == 0) return -1;

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for(int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            if(i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                if(currentEnd >= n - 1) break;
            }
        }

        return currentEnd >= n - 1 ? jumps : -1;
    }
}
