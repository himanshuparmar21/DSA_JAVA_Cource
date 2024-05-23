package Recursion.Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Dice_Target_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();

        dice("",num);
        System.out.println(diceArrayList("",num));
    }

    static void dice(String ans,int target){
        if(target == 0){
            System.out.println(ans);
            return;
        }

        for (int i = 1; i <= 6 && i<=target; i++) {
            dice(ans + i,target - i);
        }
    }

    static ArrayList<String> diceArrayList(String ans, int target){
        if(target == 0){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(ans);
            return temp;
        }

        ArrayList<String> add = new ArrayList<>();
        for (int i = 1; i <= 6 && i<=target; i++) {
            add.addAll(diceArrayList(ans + i,target - i));
        }
        return add;
    }
}
