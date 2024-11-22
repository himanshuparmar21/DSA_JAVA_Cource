package Graph;
import java.util.*;
// https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
public class BFSofgraph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];

        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()){
            Integer node = queue.poll();
            bfs.add(node);

            for (Integer num : adj.get(node)){
                if(!visited[num]){
                    visited[num] = true;
                    queue.offer(num);
                }
            }
        }
        return bfs;
    }
}
