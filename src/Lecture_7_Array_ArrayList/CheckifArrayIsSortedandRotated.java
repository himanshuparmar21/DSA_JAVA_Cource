package Lecture_7_Array_ArrayList;
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class CheckifArrayIsSortedandRotated {
    public static void main(String[] args) {
        System.out.println(check(new int[]{3,4,5,0,1,2}));
    }
    public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }
}
