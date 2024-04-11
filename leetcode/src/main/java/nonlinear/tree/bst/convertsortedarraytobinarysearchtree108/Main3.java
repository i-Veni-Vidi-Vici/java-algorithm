package nonlinear.tree.bst.convertsortedarraytobinarysearchtree108;

public class Main3 {
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

    public TreeNode dfs(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left+((right - left) / 2);
        TreeNode node = new TreeNode(nums[mid]);

        if (left <= mid - 1) {
            node.left = dfs(nums, left, mid - 1);
        }
        if (mid + 1 <= right) {
            node.right = dfs(nums, mid + 1, right);
        }

        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    // 0ms
}
