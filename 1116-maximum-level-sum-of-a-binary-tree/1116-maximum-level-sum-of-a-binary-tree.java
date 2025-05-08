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
    public int levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int k = 0;
        int maxSum = Integer.MIN_VALUE;
        int level = -1;

        while(!queue.isEmpty()){     
            int sum = 0;      
            int levelSize = queue.size();
            for(int i = 0; i <levelSize; i++){
                TreeNode curr =  queue.poll();
                sum += curr.val;
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
            if(sum > maxSum){
                maxSum = sum;
                level = k;
            }
            k++;
        }
        return level + 1;
    }
    public int maxLevelSum(TreeNode root) {
        return levelOrder(root);
    }
}