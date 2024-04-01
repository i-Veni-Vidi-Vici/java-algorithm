package nonlinear.tree.constructbinarytreefrompreorderandinordertraversal105;

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

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode node = new TreeNode();
        TreeNode root = null;
        TreeNode second = null;

        for (int i = 0; i < preorder.length; i++) {
            for (int j = 0; j < inorder.length; j++) {
                if (preorder[i] == inorder[j]) {
                    boolean sw = true;
                    for ( ;  i<=j ; i++) {
                        if (i == 0) {
                            node = new TreeNode(preorder[i]);
                            root =node;
                            second = node;
                            sw = false;
                        } else if (sw) {
                            second.right = new TreeNode(preorder[i]);
                            second = second.right;
                            node = second;
                            sw= false;
                        } else {

                            node.left = new TreeNode(preorder[i]);
                            node = node.left;
                        }
                    }
                }
            }
        }

        return root;
    }

    public static void main(String[] args) {
        buildTree(new int[]{3, 9, 20, 16, 7}, new int[]{9, 3, 15, 20, 7});
    }
    // error
}
