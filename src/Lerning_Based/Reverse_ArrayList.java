package Lerning_Based;

import java.util.ArrayList;

public class Reverse_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        reverseInGroups(list,5,3);
        System.out.println(list);
    }
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        reverse(arr,0,k-1);
        reverse(arr,k,n);
    }
    static void reverse(ArrayList<Integer> arr,int s,int e){
        while(s<=e){
            int temp1 = arr.get(s);
            int temp2 = arr.get(e);
            arr.set(e,temp1);
            arr.set(s,temp2);
            s++;
            e--;
        }
        return;
    }
}
