package Lecture_7_Array_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysLeaders {
    public static void main(String[] args) {
        System.out.println(leaders(6,new int[]{16,17,4,3,5,2}));
    }
    public static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[n-1];
        list.add(max);
        for (int i = n-2; i >= 0; i--) {
            if(max<arr[i]){
                max = arr[i];
                if(!list.contains(max)) list.add(max);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
