package 二叉树相关算法;


public class 两个节点的公共祖先{
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    /**
     * 验证二叉搜索树
     *
     * @param root
     * @return
     */
    public boolean isvaild(TreeNode root) {
        if (root == null) {
            return true;
        }
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean valid(TreeNode root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }
        if (root.val <= minValue || root.val >= maxValue) {
            return false;
        }
        return valid(root.left, minValue, root.val) && valid(root.right, root.val, maxValue);
    }

    /*
     * 寻找搜索二叉树的公共祖先
     */
    public TreeNode lowestCommonAncestor02(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < q.val && root.val < p.val) {
            return lowestCommonAncestor02(root.left, p, q);
        }
        if (root.val > q.val && root.val > p.val) {
            return lowestCommonAncestor02(root.right, p, q);
        }
        return root;
    }

    /**
     * 二叉树的公共祖先
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q||root==null) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        } else {
            if (right == null) {
                return left;
            } else {
                return root;
            }
        }

    }
}
