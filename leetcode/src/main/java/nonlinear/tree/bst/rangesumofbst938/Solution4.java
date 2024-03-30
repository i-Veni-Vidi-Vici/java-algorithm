package nonlinear.tree.bst.rangesumofbst938;

import java.util.LinkedList;
import java.util.Queue;

public class Solution4 {

    public static class TreeNode {
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        // 반복 구조 BFS 구현을 위한 큐 선언
        Queue<TreeNode> queue = new LinkedList<>();
        // 큐에 루트부터 삽입
        queue.add(root);
        // 결과 변수 선언
        int result = 0;

        while (!queue.isEmpty()) {
            // 큐에서 노드 추출
            TreeNode node = queue.poll();

            // 노드 값이 low보다 크면 더 작아도 되므로 왼쪽 자식 노드 큐에 삽입
            if (node.val > low)
                if (node.left != null) queue.add(node.left);
            // 노드 값이 high보다 작으면 더 커도 되므로 오른쪽 자식 노드 큐에 삽입
            if (node.val < high)
                if (node.right != null) queue.add(node.right);
            // 노드 값이 low보다 크고 high보다 작으면 결과에 추가
            if (low <= node.val && node.val <= high)
                result += node.val;
        }
        return result;
    }

    // 2ms
}
