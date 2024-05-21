import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(18));
    }
    static boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        return ((n==1) || (n%2==0 && isPowerOfTwo(n/2)));
    }
}