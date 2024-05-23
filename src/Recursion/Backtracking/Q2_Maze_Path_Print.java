package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_Maze_Path_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row And Column:");
        int row = sc.nextInt();
        int col = sc.nextInt();

//        path("",row,col);
        System.out.println(pathArrayList("",row,col));
    }
    static void path(String s,int r,int c){
        if(c == 1 && r == 1){
            System.out.println(s);
            return;
        }

//        if(c==1){
//            path(s+"R",r-1,c);
//        }
//        else if(r==1){
//            path(s+"D",r,c-1);
//        }
//        else{
//            path(s+"R",r-1,c);
//            path(s+"D",r,c-1);
//        }

        if(r > 1){
            path(s+"D",r-1,c);
        }
        if(c > 1){
            path(s+"R",r,c-1);
        }
    }

    static ArrayList<String> pathArrayList(String s, int r, int c){
        if(c == 1 && r == 1){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(s);
            return temp;
        }
        ArrayList<String> add = new ArrayList<>();
        if(r > 1){
            add.addAll(pathArrayList(s+"D",r-1,c));
        }
        if(c > 1){
            add.addAll(pathArrayList(s+"R",r,c-1));
        }
        return add;
    }
}
