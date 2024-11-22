package Graph;
import java.util.*;
// https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
public class DFSofgraph {
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(adj,ans,0);
        return ans;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans,int val){
        ans.add(val);
        for (Integer num : adj.get(val)){
            if(!ans.contains(num)){
                dfs(adj,ans,num);
            }
        }
    }
}
