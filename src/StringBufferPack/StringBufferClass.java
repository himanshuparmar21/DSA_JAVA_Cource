package StringBufferPack;
import java.lang.*;
public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");

        sb.insert(1," Hello by insert ");
        sb.replace(2,5,"DDDDDDDDDDD");
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Constructor 2");

//        StringBuffer sb2 = new StringBuffer(30);
    }
}
