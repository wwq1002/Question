package 剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class 之之行二叉树 {
    /**
     * 思路:用辅助队列的方式
     */
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void levelTraversal(TreeNode root) {
        if (root == null) return;
        LinkedList<TreeNode> treeQueue = new LinkedList<>();
        ArrayList<Integer> treeNodes = new ArrayList<>();
        ArrayList<ArrayList<Integer>> Lists = new ArrayList<>();
        treeQueue.add(root);
        int count = 1;
        while (!treeQueue.isEmpty()) {
            int size = treeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = treeQueue.poll();
                treeNodes.add(node.val);
                if (node.left != null) treeQueue.add(node.left);
                if (node.right != null) treeQueue.add(node.right);
            }
            if (count % 2 == 0) {
                Collections.reverse(treeNodes);/*偶数则倒序输出*/
                Lists.add(treeNodes);
            } else Lists.add(treeNodes);/*奇数则顺序输出*/
        }
    }
}
