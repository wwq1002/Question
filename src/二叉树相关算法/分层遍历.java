package 二叉树相关算法;

import java.util.LinkedList;
import java.util.List;

/**
 * 思路:用辅助队列的方式
 *
 */
public class 分层遍历 {
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public static void levelTraversal(TreeNode root){
        if (root==null){
            return;
        }
        LinkedList<TreeNode> treeQueue = new LinkedList<>();
        treeQueue.add(root);
        while (!treeQueue.isEmpty()){
            TreeNode node = treeQueue.poll();
            if (node.left!=null){
                treeQueue.add(node.left);
            }
            if (node.right!=null){
                treeQueue.add(node.right);

            }
        }
   }

    }
