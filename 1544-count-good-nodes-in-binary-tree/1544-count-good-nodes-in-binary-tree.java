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

    private int count (TreeNode root , int high){
        if(root == null)
            return 0;
        
        if(root.val < high)
            return count(root.left,high ) + count(root.right , high);
        else 
            return 1+count(root.left,root.val ) + count(root.right , root.val);
    }
    public int goodNodes(TreeNode root) {
        return count(root , root.val);
        
    }
}