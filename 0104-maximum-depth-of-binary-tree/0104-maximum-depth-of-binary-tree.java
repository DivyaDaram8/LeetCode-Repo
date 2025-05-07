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
    public int countDepth(TreeNode root){
        if(root == null) return 0;

        int left = countDepth(root.left);
        int right = countDepth(root.right);
        return (Math.max(left, right) + 1);
    }
    public int maxDepth(TreeNode root) {
        int depth = countDepth(root);
        return depth;
    }
}