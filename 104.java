/*Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return traverseTree(root, 0, 0);
    }
    
    public int traverseTree(TreeNode root, int depth, int maxDepth) {
        if (root == null) {
            return Math.max(depth, maxDepth);
        }
        
        return Math.max(traverseTree(root.left, depth + 1, Math.max(depth, maxDepth)), traverseTree(root.right, depth + 1, Math.max(depth, maxDepth)));
    }
}
