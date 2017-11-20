package cn.edu.henu.subject21;

import java.util.ArrayList;

import org.junit.Test;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author StephenChen9527
 *
 */
public class Solution {
	ArrayList<Integer> list=new ArrayList<Integer>();
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null)
        	return null;
        list.set(100, root.val);
    	
    	return list;
    }
    public static void main(String[] args) {
		new Solution().PrintFromTopToBottom(new TreeNode(100));
	}
}
