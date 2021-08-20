package interviewQuestion.binaryTree;


class Solution{

    public int sumOfLeftLeaves(TreeNode node) {
        int res = 0;
    // Update result if root is not NULL
        if (node != null)
        {
            // If left of root is NULL, then add key of
            // left child
            if (isLeaf(node.left))
                res += node.left.val;
            else // Else recur for left child of root
                res += sumOfLeftLeaves(node.left);

            // Recur for right child of root and update res
            res += sumOfLeftLeaves(node.right);
        }

        // return result
        return res;
    }

    private boolean isLeaf(TreeNode node) {
        if (node == null)
            return false;
        if (node.left == null && node.right == null)
            return true;
        return false;
    }

    public static void main(String[] args) {


    }
}
