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
    int preIndex = 0;
    Map<Integer, Integer> inorderMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            inorderMap.put(inorder[i], i);
        }
        return util(preorder, 0, inorder.length - 1);
    }
    public TreeNode util(int[] preorder, int inorderStart, int inorderEnd){
        if(inorderStart > inorderEnd){
            return null;
        }
        int val = preorder[preIndex++];
        TreeNode root = new TreeNode(val);

        int inorderIndex = inorderMap.get(val);
        root.left = util(preorder, inorderStart, inorderIndex - 1);
        root.right = util(preorder, inorderIndex + 1, inorderEnd);

        return root;
    }
}