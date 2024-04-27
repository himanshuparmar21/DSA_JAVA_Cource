package Lecture_4_Loop_Condition;

public class Count_auccorunce {
    public static void main(String[] args) {
        int num = 12423422;
        int count = 0;

        while(num>0){
            int rem = num % 10;
            if(rem == 2){
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}
