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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(0, nums.length-1, nums);
    }

    public TreeNode construct(int min, int max, int[] arr){
        if(min > max) return null;

        int max_index = min;

        for(int i = min+1; i <= max; i++){
            if(arr[i] > arr[max_index]){
                max_index = i;
            }
        }

        TreeNode root = new TreeNode(arr[max_index]);
        root.left = construct(min, max_index-1, arr);
        root.right = construct(max_index+1, max, arr);

        return root;
    }
}
