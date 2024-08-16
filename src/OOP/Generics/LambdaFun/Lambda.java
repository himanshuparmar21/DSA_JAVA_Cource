package OOP.Generics.LambdaFun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lambda {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }

        list.forEach((val) -> System.out.println(val * 2));
        list.forEach(System.out::println); // Print All Element
         */

        Operation sum = (a,b) -> a + b;
        Operation pro = (a,b) -> a * b;
        Operation div = (a,b) -> a - b;

        Lambda temp = new Lambda();
        System.out.println(temp.operation(10,20,sum));
        System.out.println(temp.operation(10,20,pro));
        System.out.println(temp.operation(10,20,div));
    }
    int operation(int a,int b,Operation op){
        return op.ope(a,b);
    }
}

interface Operation {
    int ope (int a,int b);
}