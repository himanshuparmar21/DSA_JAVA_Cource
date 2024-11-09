package Problems;
// https://leetcode.com/problems/minimum-array-end/description/
public class MinimumArrayEnd {
    public static void main(String[] args) {
        int[] arr = {4,5,6};
        System.out.println(minEnd(2,7));
    }
    //This is Brute Force That Take O(n) time
    public static long minEnd(int n, int x) {
        int temp = x;
        while (n > 1){
            temp = (temp + 1) | x;
            n--;
        }
        return temp;
    }
}
