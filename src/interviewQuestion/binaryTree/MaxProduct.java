package interviewQuestion.binaryTree;

public class MaxProduct {
    private static long maxProd = 0;
    private static long totalSum = 0;
    static int maxProduct(TreeNode root) {
        dfs(root);
        calculateSubTree(root);
        return (int)(maxProd % ((int)Math.pow(10,9) + 7));
    }

    private static long calculateSubTree(TreeNode root) {
        if (root == null)
            return 0;
        long l = calculateSubTree(root.left);
        long r = calculateSubTree(root.right);
        long subTreeSum = l + r + root.val;
        maxProd = Math.max(maxProd, (subTreeSum) * (totalSum -subTreeSum));
        return subTreeSum;
    }

    private static void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        dfs(root.right);

        totalSum += (long)root.val;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.right = new TreeNode(5);
        node.left.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(6);
        System.out.println(maxProduct(node));

    }
}
