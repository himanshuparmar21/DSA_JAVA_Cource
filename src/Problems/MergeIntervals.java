package Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[][]{{1,3}, {2,6}, {8,10}, {8,9}, {9,11}, {15,18}, {2,4}, {16,17}})));
    }
    //This is Work Some Case That Why That is Not Work
    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][];
        int maxEnd = 0;
        for (int[] interval : intervals) {
            maxEnd = Math.max(maxEnd, interval[1]);
        }
        int[] temp = new int[maxEnd + 2];
        Arrays.fill(temp, 0);
        for (int[] row : intervals) {
            int start = row[0];
            int end = row[1];
            temp[start] += 1;
            if (end + 1 < temp.length) {
                temp[end + 1] -= 1;
            }
        }
        for (int i = 1; i <= maxEnd + 1; i++) {
            temp[i] += temp[i - 1];
        }
        ArrayList<int[]> result = new ArrayList<>();
        int i = 0;
        while (i <= maxEnd) {
            if (temp[i] > 0) {
                int start = i;
                while (i <= maxEnd && temp[i] > 0) {
                    i++;
                }
                int end = i - 1;
                result.add(new int[] { start, end });
            } else {
                i++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
