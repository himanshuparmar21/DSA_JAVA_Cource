package Lerning_Based;

public class Product {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(multiply(arr,4));
    }
    static int multiply (int arr[], int n) {
        int left = 0;
        int right = 0;
        int start = 0;
        int end = 0;
        while(start<end){
            left += arr[start++];
            right += arr[end--];
        }
        if(n%2!=0){
            right += arr[(n/2)-1];
        }
        return left*right;
    }
}
