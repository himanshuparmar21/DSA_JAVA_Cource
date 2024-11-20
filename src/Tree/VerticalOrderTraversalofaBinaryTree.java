package Tree;

import java.util.*;

public class VerticalOrderTraversalofaBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode node) {
        List<List<Integer>> ans = new ArrayList<>();
        if (node == null) {
            return ans;
        }
        int col = 0;
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Map.Entry<TreeNode, Integer>> queue = new ArrayDeque<>();
        queue.offer(new AbstractMap.SimpleEntry<>(node, col));
        int min = 0;
        int max = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            Map<Integer, List<Integer>> levelMap = new HashMap<>();
            for (int i = 0; i < size; i++) {
                Map.Entry<TreeNode, Integer> removed = queue.poll();
                node = removed.getKey();
                col = removed.getValue();
                if (node != null) {
                    levelMap.putIfAbsent(col, new ArrayList<>());
                    levelMap.get(col).add(node.val);
                    min = Math.min(min, col);
                    max = Math.max(max, col);
                    queue.offer(new AbstractMap.SimpleEntry<>(node.left, col - 1));
                    queue.offer(new AbstractMap.SimpleEntry<>(node.right, col + 1));
                }
            }
            for (Map.Entry<Integer, List<Integer>> entry : levelMap.entrySet()) {
                int column = entry.getKey();
                map.putIfAbsent(column, new ArrayList<>());
                map.get(column).addAll(entry.getValue());
            }
        }
        for (int i = min; i <= max; i++) {
            if (map.containsKey(i)) {
                ans.add(map.get(i));
            }
        }
        return ans;
    }
}
