package Problems;

import java.util.ArrayList;
// https://takeuforward.org/data-structure/union-of-two-sorted-arrays/
public class UnionOFTwoShortedArrayWithoutDuplicate {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;
        ArrayList<Integer > Union=new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j])
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
            } else
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < n)
        {
            if (Union.get(Union.size() - 1) != arr1[i]) {
                Union.add(arr1[i]);
            }
            i++;
        }
        while (j < m)
        {
            if (Union.get(Union.size() - 1) != arr2[j]) {
                Union.add(arr2[j]);
            }
            j++;
        }
        return Union;
    }
}
