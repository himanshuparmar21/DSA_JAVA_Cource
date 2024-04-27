public class Demo {
    public static void main(String[] args) {
        System.out.println(count("abcABC123@#$"));
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
