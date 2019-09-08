package 二叉树相关算法;

public class 二叉树的深度 {
    /**
     * 求二叉树的深度（高度） 递归解法： O(n)
     * （1）如果二叉树为空，二叉树的深度为0
     * （2）如果二叉树不为空，二叉树的深度 = max(左子树深度， 右子树深度) + 1
     */
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static int getDepthRec(TreeNode root){
        if (root==null) return 0;
        int left = getDepthRec(root.left);
        int right = getDepthRec(root.right);
        return left>right?left+1:right+1;
    }
}
