package nonlinear.tree.bst._55_convert_sorted_array_to_binary_search_tree_108;

public class Main {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        int index = nums.length / 2;
        TreeNode node = new TreeNode(nums[index]);

        TreeNode rightNode = node;
        TreeNode leftNode = node;
        int rightIndex = index;
        int leftIndex = index;
        boolean isRight = true;
        boolean isLeft = true;

        while (isRight || isLeft) {
            // right
            if (rightIndex + 2 < nums.length) {
                rightIndex += 2;
                rightNode.right = new TreeNode(nums[rightIndex]);
                rightNode = rightNode.right;

                rightNode.left = new TreeNode(nums[rightIndex - 1]);
                if (rightIndex + 1 < nums.length) {
                    rightNode.right = new TreeNode(nums[rightIndex + 1]);
                }
            } else if(rightIndex +1 < nums.length) {
                rightNode.right = new TreeNode(nums[++rightIndex]);
                isRight = false;
            } else {
                isRight = false;
            }

            // right
            if (leftIndex -2 >=0) {
                leftIndex -= 2;
                leftNode.left = new TreeNode(nums[leftIndex]);
                leftNode = leftNode.left;

                leftNode.right = new TreeNode(nums[leftIndex +1]);
                if (leftIndex - 1 >=0) {
                    leftNode.left = new TreeNode(nums[leftIndex -1]);
                }
            } else if(leftIndex -1 >=0) {
                leftNode.left = new TreeNode(nums[--leftIndex]);
                isLeft = false;
            } else {
                isLeft = false;
            }
        }

        return node;

    }
    // error
}
