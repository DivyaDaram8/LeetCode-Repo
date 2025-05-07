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
// class Solution {
//     public void inOrder(TreeNode root, List<Integer> res){
//         if(root == null) return;

//         inOrder(root.left, res);
//         res.add(root.val);
//         inOrder(root.right, res);
//     }
//     public int kthSmallest(TreeNode root, int k) {
//         List<Integer> res = new ArrayList<>();
//         inOrder(root, res);
//         return res.get(k - 1);
//     }
// }

class Solution{
    private int res = 0;
    private int count = 0;
    public int kthSmallest(TreeNode root, int k){
        inOrder(root, k);
        return res;
    }
    public void inOrder(TreeNode root, int k){
        if(root == null) return;
        inOrder(root.left, k);

        count++;
        if(count == k){
            res = root.val;
            return;
        }
        inOrder(root.right, k);
    }
}