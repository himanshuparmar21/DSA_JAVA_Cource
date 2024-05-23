package Recursion.Permutation;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s = sc.next();

        System.out.println(permutation("",s));
    }
    static ArrayList<String> permutation(String ans,String s){
        if(s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> add = new ArrayList<>();

        for (int i = 0; i <= ans.length(); i++) {
            add.addAll(permutation(ans.substring(0,i)+s.charAt(0)+ans.substring(i),s.substring(1)));
        }
        return add;
    }
}
