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
    HashMap<Integer,Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        help(root);
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if (e.getValue()>max) max=e.getValue();
        }
        ArrayList<Integer> ans = new ArrayList<>();
         for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if (e.getValue()==max){
                ans.add(e.getKey());
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
         result[i] = ans.get(i);
        }
    return result;
    }
    void help(TreeNode root){
        if(root==null) return;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        help(root.left);
        help(root.right);
    }
}