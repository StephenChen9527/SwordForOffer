package cn.edu.henu.subject4;
/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}
 * 和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 我的blog讲解 https://my.oschina.net/u/3192601/blog/1557809
 * @author StephenChen9527
 */
import java.util.Arrays;

public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0 || in.length==0){
			return null;
		}
		int root=pre[0];
        TreeNode treeNode=new TreeNode(root);
		for(int i=0;i<in.length;i++){
			if(in[i]==root){
				//递归左子树
				treeNode.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),
						Arrays.copyOfRange(in,0, i));
				//递归右子树
				treeNode.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),
						Arrays.copyOfRange(in,i+1,in.length));
				return treeNode;
			}
			
		}
		
		return null;
    }
}