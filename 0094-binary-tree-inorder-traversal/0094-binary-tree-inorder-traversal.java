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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<Integer>();
        inorder(root, li);
        return li;
    }

    public void inorder(TreeNode root, List<Integer> li)
    {
        if(root == null) return;

        if(root.left != null)
            inorder(root.left, li);

        li.add(root.val);

        if(root.right != null)
            inorder(root.right, li);
    }
}