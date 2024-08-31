package nonlinear.tree.bst._55_convert_sorted_array_to_binary_search_tree_108;

public class Practice1 {
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

    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode(nums[nums.length / 2]);

        dfs(root, nums, nums.length / 2);

        return root;
    }

    private static void dfs(TreeNode node, int[] nums, int index) {

        if (index - 2 >= 0) {
            node.left = new TreeNode(nums[index - 2]);
            dfs(node.left, nums, index - 2);
        } else if (index - 1 >= 0) {
            node.left = new TreeNode(nums[index - 1]);
            dfs(node.left, nums, index - 1);
        } else {
            return;
        }

        if (index + 2 < nums.length) {
            node.right = new TreeNode(nums[index + 2]);
            dfs(node.right, nums, index + 2);
        } else if (index + 1 < nums.length) {
            node.right = new TreeNode(nums[index + 1]);
            dfs(node.right, nums, index + 1);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
    }

    // error
}
