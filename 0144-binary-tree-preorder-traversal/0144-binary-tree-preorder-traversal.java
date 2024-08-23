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
        List<Integer> li = new ArrayList<Integer>();
        preorder(root, li);
        return li;
    }

    public void preorder(TreeNode root, List<Integer> li)
    {
        if(root == null) return;

        li.add(root.val);

        if(root.left != null)
            preorder(root.left, li);

        if(root.right != null)
            preorder(root.right, li);
    }
}