package Graph;

import java.util.*;

public class UndirectedGraphCycle {
    boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s,
                          boolean vis[], int parent[])
    {
        Queue<Node> q =  new LinkedList<>();
        q.add(new Node(s, -1));
        vis[s] =true;
        while(!q.isEmpty()) {
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();
            for(Integer it: adj.get(node)) {
                if(!vis[it]) {
                    q.add(new Node(it, node));
                    vis[it] = true;
                }
                else if(par != it) return true;
            }
        }

        return false;
    }
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int V = 0;
        for (ArrayList<Integer> list : adj){
            for (int num : list){
                V = Math.max(V,num);
            }
        }
        boolean[] vis = new boolean[V];
        Arrays.fill(vis,false);
        int[] parent = new int[V];
        Arrays.fill(parent,-1);
        for(int i=0;i<V;i++)
            if(!vis[i])
                if(checkForCycle(adj, i,vis, parent))
                    return true;
        return false;
    }
    class Node {
        int first;
        int second;
        public Node(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}

