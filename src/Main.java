import javax.swing.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println(areRotations("mightandmagic","andmagicmigth"));
    }
    public static boolean areRotations(String s1, String s2 )
    {
        if(s1.length()!=s2.length()) return false;
        for(int i=1;i<s1.length();i++){
            String temp = s2.substring(i) + s2.substring(0,i);
            if(temp.equals(s1)) return true;
        }
        return false;
    }
}