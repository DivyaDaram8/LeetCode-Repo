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
    int sum = 0;
    public void sumTree(TreeNode root){
        if(root == null){
            return;
        }
        sumTree(root.right);
        sum += root.val;
        root.val = sum;
        sumTree(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        sumTree(root);
        return root;
    }
}