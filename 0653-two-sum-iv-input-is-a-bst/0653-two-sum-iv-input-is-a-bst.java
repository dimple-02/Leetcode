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
    HashSet<Integer> set =  new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        fn(root);
        for(int x : set){
            if ( x!=k-x && set.contains(k-x) ) return true;
        }
        return false;
    }
    void fn(TreeNode root){
        if(root==null)return;
        set.add(root.val);
        fn(root.left);
        fn(root.right);
    }
}