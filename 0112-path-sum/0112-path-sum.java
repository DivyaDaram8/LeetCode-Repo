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
    public boolean checkSum(TreeNode root, int targetSum, int currSum){
        if(root == null) return false;
        currSum += root.val;
        if(root.left == null && root.right == null){
            return targetSum == currSum;
        }
        return checkSum(root.left, targetSum, currSum) || checkSum(root.right, targetSum, currSum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return checkSum(root, targetSum, 0);
    }
}