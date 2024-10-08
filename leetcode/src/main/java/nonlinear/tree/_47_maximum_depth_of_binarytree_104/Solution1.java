package nonlinear.tree._47_maximum_depth_of_binarytree_104;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
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
    public int maxDepth(TreeNode root) {
        // 예외 처리
        if (root == null)
            return 0;
        // BFS 진행을 위한 큐 선언, 큐는 인터페이스이며 자료형 선언은 LinkedList 사용
        Queue<TreeNode> queue = new LinkedList<>();
        // 먼저 root부터 큐에 삽입
        queue.add(root);
        // 결과로 리턴할 깊이 변수 선언
        int depth = 0;

        // 큐가 모두 비워질 때까지 반복
        while (!queue.isEmpty()) {
            // 반복 처리할 때마다 깊이 +1
            depth += 1;
            // 큐 크기 계산, 이 값은 해당 깊이의 모든 노드 수와 일치한다.
            int q_size = queue.size();
            // 해당 깊이에 위치한 모든 노드 수만큼 반복
            for (int i = 0; i < q_size; i++) {
                // 가장 먼저 삽입된 노드(가장 왼쪽)부터 추출된다.
                TreeNode cur = queue.poll();
                // 왼쪽 자식 노드가 있다면 큐에 삽입
                if (cur.left != null)
                    queue.add(cur.left);
                // 오른쪽 자식 노드가 있다면 큐에 삽입
                if (cur.right != null)
                    queue.add(cur.right);
            }
        }
        // BFS 반복 횟수 == 깊이
        return depth;
    }
}
