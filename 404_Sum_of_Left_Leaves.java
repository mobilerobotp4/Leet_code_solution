/*
Find the sum of all left leaves in a given binary tree.
For problem description please visit leetcode

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
*/

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
    public int sumOfLeftLeaves(TreeNode root) {
        
        if (root==null) return 0;
        return sumLeft(root.left) + sumRight(root.right);
    }

    private int sumRight(TreeNode node) {
        if (node == null) return 0;
        return sumLeft(node.left) + sumRight(node.right);
    }

    private int sumLeft(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return node.val;
        return sumLeft(node.left) + sumRight(node.right);
        
    }
}

//Runtime: 0 ms , Memory Usage: 36.7 MB
