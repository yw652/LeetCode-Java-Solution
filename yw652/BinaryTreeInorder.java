package yw652;

// Applying iteration over the tree instead of recursion

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        TreeNode p = root;
        //While the stack is not empty OR root is not null
        while(!stack.empty() || p != null){
            
            //If the root is not null (the stack may be empty)
            if(p != null){
                //Push the node into the stack, and advance the pointer on p to its left node
                stack.push(p);
                p = p.left;
            
            // If there are no more left node to push, then pop the first one available and put it in the list
            // (the first to be traversed)
            } else {
                TreeNode t = stack.pop();
                list.add(t.val);
                //Exhaustive search of any left out "children"
                p = t.right;
            }
        }
        return list;
    }
}
