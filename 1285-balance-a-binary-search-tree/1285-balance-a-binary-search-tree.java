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
    public void getInorder(TreeNode root, List<Integer> inorder){
        if(root == null) return;
        getInorder(root.left, inorder);
        inorder.add(root.val);
        getInorder(root.right, inorder);
    }
    public TreeNode constructBST(List<Integer> inorder, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(inorder.get(mid));
        root.left = constructBST(inorder, start, mid - 1);
        root.right = constructBST(inorder, mid + 1, end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        return constructBST(inorder, 0, inorder.size() - 1);
    }
}