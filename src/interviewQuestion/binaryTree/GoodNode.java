package interviewQuestion.binaryTree;

/**
 * Count Good Nodes in Binary Tree
 *
 * Solution
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
 *
 * Return the number of good nodes in the binary tree.
 *
 * INPUT: root = [3,1,4,3,null,1,5]
 * Output: 4
 * Explanation: Nodes in blue are good.
 * Root Node (3) is always a good node.
 * Node 4 -> (3,4) is the maximum value in the path starting from the root.
 * Node 5 -> (3,4,5) is the maximum value in the path
 * Node 3 -> (3,1,3) is the maximum value in the path.
 */

/**
 * Solution
 * To find whether a node is good or not we must traverse path from root to the that node and check if its value is not smaller than maximum in this path.
 * To find the number of good nodes we have to check like this for each node of the given binary tree. But here observe one thing,
 *
 * if we find the answer for a particular node by traversing its path from root, we can go to its child node also from there itself because we have already traversed almost path of child node also and we also have maximum value traversed till yet. We just have to update the maximum with current node value to transfer to its both children node.
 * So this looks like a DFS or recursion where to go to a particular node we traverse the path from root to that node. Thus in this problem recursion will be very helpful. The steps are:
 *
 * Create a recursive function with two arguments as its parameter. One is the address of the node and second is the maximum value we found till here.
 * Now whenever we will be at a particular node we will check if current node value is smaller than current max. If it is not smaller we will add this node to our ans and call the same function for its child nodes after updating the maximum value.
 */
public class GoodNode {

    public static int goodNodes(TreeNode root) {
        int max = Integer.MIN_VALUE;
        return dfs(root, max);
    }

    private static int dfs(TreeNode root, int max) {
        if(root == null)
            return 0;
        int current = 0;
        if (max <= root.val)
            current++;
        max = Math.max(max, root.val);
        return dfs(root.left, max) + dfs(root.right, max) + current;
    }

    public static void main(String[] args) {
        TreeNode root= new TreeNode(3);
        root.left=  new TreeNode(1);
        root.right=  new TreeNode(4);
        root.left.left=  new TreeNode(3);
        root.right.left=  new TreeNode(1);
        root.right.right=  new TreeNode(5);

        System.out.println( goodNodes(root) );

    }
}
