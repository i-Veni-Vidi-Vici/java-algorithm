package dfs.populating_next_right_pointers_in_each_node_116;

public class Practice1 {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        if (root.left != null) {
            root.left.next = root.right;
        }

        connect(root.left);
        connect(root.right);

        return root;

    }

    // error
}
