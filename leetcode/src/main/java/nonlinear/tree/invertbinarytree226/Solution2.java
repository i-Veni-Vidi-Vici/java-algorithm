package nonlinear.tree.invertbinarytree226;


public class Solution2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        // 빈 노드가 아닐때 처리
        if (root != null) {
            // 왼쪽/오른쪽 자식 노드 스왑
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            invertTree(root.left);  // 왼쪽 자식 노드 DFS
            invertTree(root.right); // 오른쪽 자식 노드 DFS
        }
        return root;
    }

    // 0ms
}
