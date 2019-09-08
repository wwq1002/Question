package 二叉树相关算法;

import java.util.Stack;

public class 深度优先遍历 {
    public static void preorderTraversal(TreeNode root) {
        if (root==null)return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.println(node.val);
            if (null!=node.left){
                stack.push(node.left);
            }
            if (null!=node.right){
                stack.push(node.right);
            }
        }

    }
}
