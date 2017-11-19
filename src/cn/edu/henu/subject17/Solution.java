package cn.edu.henu.subject17;
/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 *     		8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7   5
    	
    	只要交换左右就可以了
 * @author StephenChen9527
 *
 */
public class Solution {
    public void Mirror(TreeNode root) {
    	if(root!=null){
    		TreeNode temp=root.left;
    		root.left=root.right;
    		root.right=temp;
    		Mirror(root.left);
    		Mirror(root.right);
    	}
    }
}
