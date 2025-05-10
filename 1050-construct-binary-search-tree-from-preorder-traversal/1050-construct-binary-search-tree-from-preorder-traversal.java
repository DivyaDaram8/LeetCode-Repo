/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int index = 0;

    public TreeNode constructBST(int[] preorder, int bound) {
        if (index == preorder.length || preorder[index] > bound) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[index++]);
        root.left = constructBST(preorder, root.val);
        root.right = constructBST(preorder, bound);
        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        return constructBST(preorder, Integer.MAX_VALUE);
    }
}
