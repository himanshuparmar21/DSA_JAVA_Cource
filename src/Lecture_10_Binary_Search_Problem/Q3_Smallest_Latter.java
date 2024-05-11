package Lecture_10_Binary_Search_Problem;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class Q3_Smallest_Latter {
    public static void main(String[] args) {

        char[] arr = {'c','f','j'};
        char target = 'j';
        char ans = nextGreatestLatter(arr, target);
        System.out.println(ans);
    }
    static char nextGreatestLatter(char[] arr, char target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
