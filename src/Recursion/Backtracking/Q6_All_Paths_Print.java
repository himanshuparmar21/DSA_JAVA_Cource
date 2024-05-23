package Recursion.Backtracking;

import java.util.Arrays;

public class Q6_All_Paths_Print {
    public static void main(String[] args) {
        boolean[][] temp = {{true, true, true}, {true, true, true}, {true, true, true}};
        int[][] path = new int[temp.length][temp[0].length];
        allPathPrint("", temp, 0, 0, path, 1);
    }

    static void allPathPrint(String s, boolean[][] temp, int r, int c, int[][] path, int step) {
        if (r == temp.length - 1 && c == temp[0].length - 1) {
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(s);
            System.out.println();
            return;
        }

        if (!temp[r][c]) return;
        temp[r][c] = false;
        path[r][c] = step;

        if (r < temp.length - 1) {
            allPathPrint(s + "D", temp, r + 1, c, path, step + 1);
        }
        if (c < temp.length - 1) {
            allPathPrint(s + "R", temp, r, c + 1, path, step + 1);
        }

        if (r > 0) {
            allPathPrint(s + "U", temp, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            allPathPrint(s + "L", temp, r, c - 1, path, step + 1);
        }

        temp[r][c] = true;
        path[r][c] = 0;
    }
}
