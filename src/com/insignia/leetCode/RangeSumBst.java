/**
 * 938. Range Sum of BST
 
 Definition for a binary tree node.public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
*/
package com.insignia.leetCode;

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;

        if (root == null) {
            return 0;
        }

        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        if (root.left != null) {
            int ls = rangeSumBST(root.left, low, high);
            sum += ls;
        }

        if (root.right != null) {
            int rs = rangeSumBST(root.right, low, high);
            sum += rs;
        }

        return sum;
    }
}