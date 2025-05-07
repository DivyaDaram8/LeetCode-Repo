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
    public boolean isTrue(TreeNode root, long min, long max){
        if(root == null) return true;
        if(root.val <= min || root.val >= max){
            return false;
        }
        boolean left = isTrue(root.left, min, root.val);
        boolean right = isTrue(root.right, root.val, max);
        return left && right;
    }
    public boolean isValidBST(TreeNode root) {
        return isTrue(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}