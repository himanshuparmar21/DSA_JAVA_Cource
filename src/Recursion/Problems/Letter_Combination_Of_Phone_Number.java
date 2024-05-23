package Recursion.Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Letter_Combination_Of_Phone_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        String s = sc.next();

        System.out.println(pad("",s));;
    }
    static ArrayList<String> pad(String ans, String s){
        if(s.isEmpty()){
//            System.out.println(ans);
            ArrayList<String> temp = new ArrayList<>();
            temp.add(ans);
            return temp;
        }

        ArrayList<String> add = new ArrayList<>();
        int digit = s.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            add.addAll(pad(ans+(char)('a' + i),s.substring(1)));
        }

        return add;
    }
}
