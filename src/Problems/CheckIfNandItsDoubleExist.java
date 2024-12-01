package Problems;

import java.util.HashMap;

// https://leetcode.com/problems/check-if-n-and-its-double-exist
public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{10,2,8,3}));
    }
    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i] * 2) && i != map.get(arr[i] * 2)) return true;
        }
        return false;
    }
    public boolean checkIfExist2(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if((arr[i]==2*arr[j]) || (arr[j]==2*arr[i])) return true;
            }
        }
        return false;
    }
}
