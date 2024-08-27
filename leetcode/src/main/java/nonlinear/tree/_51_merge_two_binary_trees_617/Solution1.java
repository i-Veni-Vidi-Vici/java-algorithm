package nonlinear.tree._51_merge_two_binary_trees_617;


// TODO : dfs
public class Solution1 {
    public static class TreeNode {
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
    public  static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // 한쪽이 널이면 널이 아닌 노드를 리턴한다.
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        // 병합된 노드 생성
        TreeNode node = new TreeNode(root1.val + root2.val);
        // 병합된 노드의 자식 노드로 기존 노드 왼쪽 자식 노드 DFS 진행
        node.left = mergeTrees(root1.left, root2.left);
        // 병합된 노드의 자식 노드로 기존 노드 오른쪽 자식 노드 DFS 진행
        node.right = mergeTrees(root1.right, root2.right);
        // 병합된 노드 리턴
        return node;
    }

    public static void main(String[] args) {
                mergeTrees(new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2)),
               new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7))));
    }

    // 0ms
}
