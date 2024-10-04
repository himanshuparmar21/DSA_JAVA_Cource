package Lecture_7_Array_ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DividePlayersIntoTeamsofEqualSkill {
    public static void main(String[] args) {
        System.out.println(dividePlayers(new int[]{1,1,1,2,3,3,3,7,7,8,8,8,9,9}));
    }
    public static long dividePlayers(int[] skill) {
        int n = skill.length;
        Arrays.sort(skill); // Sort The Array
        int target = skill[0] + skill[n-1];
        long ans = (long) skill[0] * skill[n-1];

        int start = 1;
        int end = n-2;
        while (start<end){
            if(skill[start] + skill[end] == target){
                ans += (long) skill[start] * skill[end];
            }else {
                return -1;
            }
            start++;
            end--;
        }
        return ans;
    }
}
