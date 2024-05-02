import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(count("abcABC123@#$")));
        int[] arr = {1,3,4,2,2};

        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans ^= (arr[i] ^ i+1);
        }
        System.out.println(ans ^ arr.length);
    }
    static int[] count (String s)
    {
        int upper = 0,lower=0,special=0,number=0;
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                upper++;
            }else if(Character.isLowerCase(ch)){
                lower++;
            }else if(Character.isDigit(ch)){
                number++;
            }else{
                special++;
            }
        }
        System.out.println(upper+lower+number+special);
        return new int[]{upper,lower,number,special};
    }
}
