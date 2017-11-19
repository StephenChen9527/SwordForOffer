package cn.edu.henu.subject16;
/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 * 
 * @author StephenChen9527
 *
 */
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	if(root1==null||root2==null){
    		return false;
    	}
    	boolean f=false;
    	if(root1.val==root2.val){
    		boolean left=false;
    		boolean right=false;
    		if(root2.left==null){
    			left=true;
    		}else if(root1.left!=null && root2.left!=null){
    			left=HasSubtree(root1.left,root2.left);
    		}
    		if(root2.right==null){
    			right=true;
    		}else if(root1.right!=null &&root2.right!=null){
    			right=HasSubtree(root1.right,root2.right);
    		}
    		f= left&&right;
    	}
    	if(!f){
    		boolean left=false;
    		boolean right=false;
    		if(root1.left!=null){
    			left=HasSubtree(root1.left,root2);
    		}
    		if(root1.right!=null){
    			right=HasSubtree(root1.right,root2);
    		}
    		f= left||right;
    	}
		
		return f;
		
    	
    	
    	
    }
    //{8,8,7,9,2,#,#,#,#,4,7},{8,9,2}
    public static void main(String[] args) {
    	TreeNode root1=new TreeNode(8);
    	root1.left=new TreeNode(8);
    	root1.right=new TreeNode(7);
    	root1.left.left=new TreeNode(9);
    	root1.left.right=new TreeNode(4);
    	root1.right.left=new TreeNode(11);
    	root1.right.right=new TreeNode(12);
    	
    	
    	
    	TreeNode root2=new TreeNode(8);
    	root2.left=new TreeNode(9);
    	root2.right=new TreeNode(2);
    	System.out.println(new Solution().HasSubtree(root1, root2));
    	
	}
}