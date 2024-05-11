package Lecture_10_Binary_Search_Problem;
//// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class Q5_Find_Element_In_Infinity_Array {
    public static void main(String[] args) {
        int[] arr = {2,5,7,12,34,100,299,1006,9999};

        System.out.println(ans(arr,1006));
    }
    static int ans(int[] nums,int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > nums[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(nums,target,start,end);
    }
    static int binarySearch(int[] arr, int target,int start,int end) {

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }
        return -1;
    }
}
