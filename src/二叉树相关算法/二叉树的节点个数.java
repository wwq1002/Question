package 二叉树相关算法;

import java.util.LinkedList;

public class 二叉树的节点个数 {
    /**
     * 方法一：
     * 求二叉树中的节点个数递归解法： O(n)
     * （1）如果二叉树为空，节点个数为0
     * （2）如果二叉树不为空，二叉树节点个数 = 左子树节点个数 +
     * 右子树节点个数 + 1
     */
    public static int getNodeNumRec(TreeNode root) {
            if (root == null) return 0;
        else
            return  getNodeNumRec(root.left) + getNodeNumRec(root.right) + 1;
    }

    /**
     * @param root
     */
    public static int levelTraversal(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> treeQueue = new LinkedList<>();
        treeQueue.add(root);
        int count = 1;
        while (!treeQueue.isEmpty()) {
            TreeNode node = treeQueue.poll();
            count++;
            System.out.println(node.val);
            if (node.left != null) {
                treeQueue.add(node.left);
            }
            if (node.right != null) {
                treeQueue.add(node.right);

            }
        }
        return  count;
    }
}

