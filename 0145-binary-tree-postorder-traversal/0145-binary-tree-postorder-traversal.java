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

//********************************** Recursive approach

// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> li = new ArrayList<Integer>();
//         postorder(root, li);
//         return li;
//     }

//     public void postorder(TreeNode root, List<Integer> li)
//     {
//         if(root == null) return;

//         if(root.left != null)
//             postorder(root.left, li);

//         if(root.right != null)
//             postorder(root.right, li);
        
//         li.add(root.val);
//     }
// }

//********************************** Iterative approach

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        List<Integer> li = new ArrayList<>();

        if(root == null) return li;
        stack1.push(root);

        while(!stack1.isEmpty())
        {
           TreeNode node = stack1.pop();
           stack2.push(node);
           if(node.left != null) stack1.push(node.left);
           if(node.right != null) stack1.push(node.right);
        }

        while(!stack2.isEmpty())
        {
            li.add(stack2.pop().val);
        }

        return li;
    }
}
