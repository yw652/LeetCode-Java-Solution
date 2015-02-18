package yw652;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePreorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(root == null){
            return list;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        while(!stack.empty()){
            TreeNode n = stack.pop();
            list.add(n.val);
            
            if(n.right != null){
                stack.push(n.right);
            }
            if (n.left != null){
                stack.push(n.left);
            }
        }
        return list;
    }
}