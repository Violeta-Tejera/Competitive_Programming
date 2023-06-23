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
        if(root == null) return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        inorderTraversalREC(list, root);

        return list;
    }

    public void inorderTraversalREC(List<Integer> list, TreeNode root){
        if(root == null) return;

        inorderTraversalREC(list, root.left);
        list.add(root.val);
        inorderTraversalREC(list, root.right);
    }
}
