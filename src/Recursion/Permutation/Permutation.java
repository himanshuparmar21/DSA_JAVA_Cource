package Recursion.Permutation;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s = sc.next();

        permutation("",s);
    }
    static void permutation(String ans,String s){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ans.length()+1; i++) {
            permutation(ans.substring(0,i)+s.charAt(0)+ans.substring(i),s.substring(1));
        }
    }
}
