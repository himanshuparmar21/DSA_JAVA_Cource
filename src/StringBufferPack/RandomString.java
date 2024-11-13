package StringBufferPack;

public class RandomString {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 15 ; i++) {
            int randomChar = (int) ((97) + (24 * Math.random()));
            char ch = (char) (randomChar);
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
