package Recursion.Backtracking;

import java.util.Scanner;

public class Q4_Maze_Obstacles {
    public static void main(String[] args) {
        boolean[][] temp = {{true,true,true},{true,false,true},{true,true,true}};

        maze("",temp,0,0);
    }
    static void maze(String s,boolean[][] temp,int r,int c){
        if(r == temp.length - 1 && c == temp[0].length - 1){
            System.out.println(s);
            return;
        }

        if(!temp[r][c]) return;

        if(r < temp.length - 1){
            maze(s+"D",temp,r+1,c);
        }
        if(c < temp.length - 1){
            maze(s+"R",temp,r,c+1);
        }
    }
}
