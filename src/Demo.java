import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;

public class Demo{
    public static void main(String[] args){
        String a = "alu";
        String b = "ula";
        int ans = 0;
        for (int i = 0; i < a.length(); i++) {
            ans ^= (a.charAt(i) ^ b.charAt(i));
        }
        System.out.println(ans);
    }
}