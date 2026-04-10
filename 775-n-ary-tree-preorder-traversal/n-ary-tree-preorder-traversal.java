/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans=new ArrayList<>();
        return calling(root,ans);
    }

    public List<Integer> calling(Node root,List<Integer> ans){
        if(root==null){
            return ans;
        }

        ans.add(root.val);

        for(Node child : root.children){
            calling(child,ans);
        }

        return ans;
    }
}