package interviewQuestion.binaryTree;

import java.util.HashSet;
import java.util.Set;

/**
 * Given the root of a Binary Search Tree and a target number k, return true if there exist
 * two elements in the BST such that their sum is equal to the given target.
 *
 * @INPUT: root[5,3,6,2,4,null,7], k = 9
 * @OUTPUT: true
 * @INPUT: root[5, 3, 6, 2, 4, null, 7], k = 28
 *  @OUTPUT: false
 */
public class FindTargetSolution {
    // Hashmap, in-order traverse for smaller items, recursively
   static Set<Integer>  set = new HashSet<>();
    public static boolean findTarget(TreeNode root, int k) {
        // check root if the node empty return false
        if(root == null) return false;
        if (findTarget(root.left, k)) return true;
        if (set.contains(k-root.val)) return true;
        set.add(root.val);
        if (findTarget(root.right, k)) return true;
        return false;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.right = new TreeNode(5);
        node.left.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(6);
        System.out.println(findTarget(node,15));
    }
}
