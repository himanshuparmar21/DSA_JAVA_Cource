package Problems;

// https://leetcode.com/problems/divide-intervals-into-minimum-number-of-groups/description
import java.util.Arrays;

public class DivideIntervalsIntoMinimumNumberofGroups {
    public static void main(String[] args) {
        System.out.println(minGroups(new int[][]{{1,1}}));
    }
    public static int minGroups(int[][] intervals) {
        int[] temp = new int[100000];
        Arrays.fill(temp,0);

        int ans = Integer.MIN_VALUE;

        for (int[] row : intervals){
            int start = row[0];
            int end = row[1];

            temp[start] += 1;
            temp[end+1] += -1;
        }

        for (int i = 1; i < 100000; i++) {
            temp[i] += temp[i-1];
            ans = Math.max(ans,temp[i-1]);
        }
        return ans;
    }
}
