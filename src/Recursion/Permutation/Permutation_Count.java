package Recursion.Permutation;

import java.util.Scanner;

public class Permutation_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s = sc.next();

        System.out.println(count("",s));
    }
    static int count(String ans,String s){
        if(s.isEmpty()){
            return 1;
        }

        int count = 0;

        for (int i = 0; i <= ans.length(); i++) {
            count += count(ans.substring(0,i)+s.charAt(0)+ans.substring(i),s.substring(1));
        }
        return count;
    }
}
