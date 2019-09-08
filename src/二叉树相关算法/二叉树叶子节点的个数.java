package 二叉树相关算法;

public class 二叉树叶子节点的个数 {
    public static int getNodeNumLeafRec(TreeNode root){
        if (root==null)return 0;
        if (root.left==null&&root.left==null)return 1;
        return getNodeNumLeafRec(root.left)+getNodeNumLeafRec(root.right);
    }
}
