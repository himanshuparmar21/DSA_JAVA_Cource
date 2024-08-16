package OOP.Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] arr;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        arr = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            reduce();
        }
        arr[size++] = num;
    }

    public boolean isFull(){
        return size == arr.length;
    }
    public void reduce(){
        int[] temp = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public int get(int idx){
        return arr[idx];
    }

    public int remove(){
        return arr[--size];
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        System.out.println(list.toString());;
    }
}
