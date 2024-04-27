package Lecture_6_Functions_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Change_Value {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr = {1,2,3,4,5};
        System.out.println("Before Change:" + Arrays.toString(arr));
        change(arr);
        System.out.println("After Change:" + Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 100; //if you make change to the object vie ref variable ,then also change Original variable/object
    } 
}
