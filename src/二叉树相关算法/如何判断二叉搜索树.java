package 二叉树相关算法;

public class 如何判断二叉搜索树 {
    //计算高度
    public int treedeep(TreeNode root){
        if (root==null)return 0;
        int left=treedeep(root.left);
        int right=treedeep(root.right);
        return Math.max(left,right)+1;
    }
    public boolean QueryTree(TreeNode root){
        if (root==null)return true;
        int left=treedeep(root.left);
        int right=treedeep(root.right);
        if (Math.abs(right-left)>1)
            return false;
        boolean treeleft=QueryTree(root.left);
        boolean treeright=QueryTree(root.right);
        return treeleft&&treeright;
    }
}
