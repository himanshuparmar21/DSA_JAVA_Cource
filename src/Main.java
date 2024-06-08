import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(firstNonRepeating(new int[]{1,2,1,3,4,3},4));
    }
    static int sumOfNaturals(int n) {
        return (((n * ((n+1)%1000000007))%1000000007)/2)%1000000007;
    }
}