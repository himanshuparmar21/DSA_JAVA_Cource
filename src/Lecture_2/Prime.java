package Lecture_2;

import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(primeMethod1(num));
        System.out.println(primeMethod2(num));
        System.out.println(primeMethod3(num));
//      Method 2 & 3 Efficient ( i <= MAth.sqrt(num) && i * i <= num ) Both Are Same
    }
    static List<Integer> primeMethod1(int num){
        List<Integer> list = new ArrayList<>();
        int temp ;
        long count = 0;
        for (int i = 1; i < num; i++) {
            temp = 0;
            for (int j = 2; j < i; j++) {
                count++;
                if(i%j==0){
                    temp = 1;
                }
            }
            if(temp!=1){
                list.add(i);
            }
        }
        System.out.println(count);
        return list;
    }
    static List<Integer> primeMethod2(int num){
        List<Integer> list = new ArrayList<>();
        int temp ;
        int count = 0;
        for (int i = 1; i < num; i++) {
            temp = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                count++;
                if(i%j==0){
                    temp = 1;
                }
            }
            if(temp!=1){
                list.add(i);
            }
        }
        System.out.println(count);
        return list;
    }
    static List<Integer> primeMethod3(int num){
        List<Integer> list = new ArrayList<>();
        int temp ;
        int count = 0;
        for (int i = 1; i < num; i++) {
            temp = 0;
            for (int j = 2; j * j <= i; j++) {
                count++;
                if(i%j==0){
                    temp = 1;
                }
            }
            if(temp!=1){
                list.add(i);
            }
        }
        System.out.println(count);
        return list;
    }
}
