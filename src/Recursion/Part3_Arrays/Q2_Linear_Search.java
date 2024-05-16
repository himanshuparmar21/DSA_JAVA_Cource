package Recursion.Part3_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q2_Linear_Search {
    public static void main(String[] args) {
        int[] arr = inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target :");
        int target = sc.nextInt();

        //return True/False
        System.out.println(find(arr, target, 0));
        //Return First Found Index
        System.out.println(findIndex(arr, target, 0));
        //Return Last Found Index
        System.out.println(findIndexLast(arr, target, arr.length - 1));
        //Not Return Just all Found Index Add In Static Arraylist and Then Print
        findAllIndex(arr,target,0);
        System.out.println(list);
        //Return ArrayList
        System.out.println(findAllIndex(arr,target,0,new ArrayList<>()));

        //NOt Passing ArrayList And Return list
        System.out.println(findAllIndex2(arr,target,0));
    }

    static boolean find(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return false;
        }

        return arr[idx] == target || find(arr, target, idx + 1);
    }

    static int findIndex(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == target) {
            return idx;
        } else {
            return findIndex(arr, target, idx + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int idx) {
        if (idx < 0) {
            return -1;
        }

        if (arr[idx] == target) {
            return idx;
        } else {
            return findIndexLast(arr, target, idx - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return ;
        }

        if (arr[idx] == target) {
            list.add(idx);
        }
        findAllIndex(arr, target, idx + 1);
    }


    //Return ArrayList
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int idx,ArrayList<Integer> list) {
        if (idx == arr.length) {
            return list;
        }

        if (arr[idx] == target) {
            list.add(idx);
        }
        return findAllIndex(arr, target, idx + 1,list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
