package dfs.maximum_depth_of_na_ary_tree_559;

import java.util.List;

public class Practice1 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    int max =0;
    public int maxDepth(Node root) {
        return dfs(root)+1;
    }

    private int dfs(Node node){
        if(node == null){
            return 0;
        }

        for(Node child : node.children){
            int val = dfs(child);
            max = Math.max(val, max);
        }

        return max+1;
    }
    // error
}
