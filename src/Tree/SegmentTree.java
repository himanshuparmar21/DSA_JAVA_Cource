package Tree;

public class SegmentTree {
    public class TreeNode{
        public int value;
        public int start;
        public int end;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int start,int end){
            this.start = start;
            this.end = end;
        }
    }

    public TreeNode root;

    public SegmentTree(int[] arr){
        root = createTree(arr,0,arr.length-1);
    }

    public TreeNode createTree(int[] arr,int start,int end){
        if(start == end){
            TreeNode leaf = new TreeNode(start,end);
            leaf.value = arr[start];
            return leaf;
        }

        TreeNode node = new TreeNode(start,end);
        int mid = (start + end) / 2;

        node.left = createTree(arr,start,mid);
        node.right = createTree(arr,mid+1,end);

        node.value = node.left.value + node.right.value;
        return node;
    }

    public int query(TreeNode node,int qStart,int qEnd){
        if (node == null || node.start > qEnd || node.end < qStart) {
            // Node is completely outside the query range
            return 0;
        }
        if (node.start >= qStart && node.end <= qEnd) {
            // Node is completely within the query range
            return node.value;
        }
        // Partial overlap, recurse on children
        return query(node.left, qStart, qEnd) + query(node.right, qStart, qEnd);
    }

    public int update(TreeNode node,int index ,int value){
        if(index >= node.start && node.end <= index){
            if(index == node.start && node.end == index){
                node.value = value;
                return node.value;
            }else{
                int leftVal = update(node.left,index,value);
                int rightVal = update(node.right,index,value);

                node.value = leftVal + rightVal;
                return node.value;
            }
        }
        return node.value;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};

        SegmentTree tree = new SegmentTree(arr);
        System.out.println(tree.query(tree.root,2,6));
    }
}
