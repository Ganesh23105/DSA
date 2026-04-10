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
    public List<Integer> preorderTraversal(TreeNode root) {
        return build(root);
    }

    public List<Integer> build(TreeNode Node){
        List<Integer> ans=new ArrayList<>();
        if(Node==null){
            return ans;
        }
        ans.add(Node.val);

        ans.addAll(build(Node.left));
        ans.addAll(build(Node.right));
        return ans;
    }
}