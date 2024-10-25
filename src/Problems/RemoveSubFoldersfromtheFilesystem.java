package Problems;
// https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubFoldersfromtheFilesystem {
    public static void main(String[] args) {
//        System.out.println(removeSubfolders(new String[]{"/a","/a/b","/c/d","/c/d/e","/c/f"}));
        System.out.println(removeSubfolders(new String[]{"/a","/a/b/c","/a/b/d"}));
        System.out.println(removeSubfolders(new String[]{"/a/b/c","/a/b/ca","/a/b/d"}));
    }
    public static List<String> removeSubfolders(String[] fol) {
        Arrays.sort(fol);

        List<String> ans = new ArrayList<>();
        ans.add(fol[0]);

        for (int i = 1; i < fol.length; i++) {
            String lastFol = ans.getLast() + "/";

            if(!fol[i].startsWith(lastFol)){
                ans.add(fol[i]);
            }
        }
        return ans;
    }
}
