package Recursion.Backtracking;

public class Q5_All_Paths {
    public static void main(String[] args) {
        boolean[][] temp = {{true,true,true},{true,true,true},{true,true,true}};
        allPath("",temp,0,0);
    }
    static void allPath(String s, boolean[][] temp, int r, int c){
        if(r == temp.length - 1 && c == temp[0].length - 1){
            System.out.println(s);
            return;
        }

        if(!temp[r][c]) return;
        temp[r][c] = false;

        if(r < temp.length - 1){
            allPath(s+"D",temp,r+1,c);
        }
        if(c < temp.length - 1){
            allPath(s+"R",temp,r,c+1);
        }

        if(r > 0){
            allPath(s+"U",temp,r-1,c);
        }
        if(c > 0){
            allPath(s+"L",temp,r,c-1);
        }

        temp[r][c] = true;
    }
}
