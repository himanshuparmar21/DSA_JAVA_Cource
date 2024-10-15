package Problems;
// https://leetcode.com/problems/add-minimum-number-of-rungs/
public class AddMinimumNumberofRungs {
    public static void main(String[] args) {
        System.out.println(addRungs(new int[]{4,1000000000},1));
    }
    public static int addRungs(int[] rungs, int dist) {
        int ans = 0;
        int last = 0;

        int i = 0;
        while (i < rungs.length){
            //This is Right But Every Time Check still not Found right range
            //That why this give TLE
//            int temp = rungs[i];
//            if((temp - last) > dist){
//                last += dist;
//                ans++;
//            }
//            else{
//                last = temp;
//                i++;
//            }
            int temp = rungs[i];
            int diff = (temp - last);
            if(diff > dist){
                last = temp;
                ans += (diff%dist==0)? diff/dist-1: diff/dist;;
            }
            else{
                last = temp;
            }
            i++;
        }
        return ans;
    }
}
