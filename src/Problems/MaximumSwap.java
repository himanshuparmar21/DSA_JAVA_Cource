package Problems;
// https://leetcode.com/problems/maximum-swap/submissions/
public class MaximumSwap {
    public static void main(String[] args) {
        System.out.println(maximumSwap(2736));
    }
    public static int maximumSwap(int num) {
        char[] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;

        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[numArr[i] - '0'] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int d = 9; d > numArr[i] - '0'; d--) {
                if (last[d] > i) {
                    // Swap and return the new number
                    char temp = numArr[i];
                    numArr[i] = numArr[last[d]];
                    numArr[last[d]] = temp;
                    return Integer.parseInt(new String(numArr));
                }
            }
        }
        return num;
    }
}
