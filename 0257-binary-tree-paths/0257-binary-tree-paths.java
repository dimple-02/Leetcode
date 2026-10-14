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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        path(root,"",0,list);
        return list;
    }
    void path(TreeNode root, String s, int i, List<String> list){
        if(root==null){
            return;
        }
        s+=root.val;
        if(root.left!=null || root.right!=null) s+="->";
        if(root.left==null && root.right==null){
            list.add(s);
            return;
        }
        
        path(root.left,s,i+1,list);
        path(root.right,s,i+1,list);
    }
}