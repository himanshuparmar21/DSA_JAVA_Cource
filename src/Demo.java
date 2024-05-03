import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(count("abcABC123@#$")));
        System.out.println(compareVersion("0.1","1.1"));
    }
        static int compareVersion(String version1, String version2) {
            String[] s1 = version1.split("\\.");
            String[] s2 = version2.split("\\.");

            for(int i=0;(i<s1.length && i<s2.length);i++){
                if(s1[i].compareTo(s2[i]) == 1){
                    return 1;
                }else if(s1[i].compareTo(s2[i]) == -1){
                    return -1;
                }
            }
            return 0;
    }
}
