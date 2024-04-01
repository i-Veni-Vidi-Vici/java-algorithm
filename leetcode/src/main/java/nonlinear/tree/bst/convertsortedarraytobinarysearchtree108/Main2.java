package nonlinear.tree.bst.convertsortedarraytobinarysearchtree108;

public class Main2 {
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

    public static TreeNode dfs(int[] nums, TreeNode node, int left, int right) {
        if (node == null) {
            node = new TreeNode(nums[(right - left) / 2]);
        }
        // right = (right - left) / 2 -1
        if (((right - left) / 2 -1) -left >= 0) {
            node.left = new TreeNode( nums[(((right - left) / 2 -1) -left)/2]);
            dfs(nums, node.left, left, (right - left) / 2- 1);
        }


        if (right - ((right - left) / 2 + 1) >=(right - left) / 2 + 1) {
            node.right = new TreeNode( nums[((right - left) / 2 + 1) + (right - ((right - left) / 2 + 1))/2]);
            dfs(nums, node.right, (right - left) / 2 + 1, right);
        }

        return node;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        return dfs(nums, null, left, right);
    }

    public static void main(String[] args) {
        sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
    // error
}
