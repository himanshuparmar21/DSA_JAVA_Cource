package Problems;
// https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/
public class FindKthBitinNthBinaryString {
    public static void main(String[] args) {
        System.out.println(findKthBit(0,1));
    }
    public static char findKthBit(int n, int k) {
        String s = findString("0",n);
        return s.charAt(k-1);
    }
    public static String findString(String s,int n){
        StringBuilder sBuilder = new StringBuilder(s);
        while (n-- > 1){
            StringBuilder sb = new StringBuilder();
            for(char ch : sBuilder.toString().toCharArray()){
                sb.append(ch=='0'?'1':'0');
            }
            sBuilder.append("1").append(sb.reverse());
        }
        s = sBuilder.toString();
        return s;
    }
}
