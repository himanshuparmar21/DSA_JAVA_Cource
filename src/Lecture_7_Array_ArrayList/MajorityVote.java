package Lecture_7_Array_ArrayList;
// https://www.geeksforgeeks.org/problems/majority-vote/1
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MajorityVote {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(List.of(2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6));
        System.out.println(findMajority(num));
    }
    public static List<Integer> findMajority(List<Integer> nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int len = nums.size()/3;
        nums.clear();
        for (int key : map.keySet()){
            if(map.get(key) >= len){
                nums.add(key);
            }
        }
        return nums.isEmpty() ? Collections.singletonList(-1) :nums;
    }
}
