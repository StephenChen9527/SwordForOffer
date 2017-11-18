package cn.edu.henu.subject1;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 * @author StephenChen9527
 *
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
		if(array==null|| array.length==0 ||array[0].length==0 ||target<array[0][0] || target>array[array.length-1][array[0].length-1]){
			return false;
		}
		int n=0;
		for(int i=0;i<array.length;i++){
			
			//每行第一个如果比 目标大，就返回false
			if(array[i][n]>target){
				return false;
			}
			//如果当前行的最后一个 比目标小，就直接下一行
			if(target>array[i][array[i].length-1]){
				continue;
			}
			//循环判断列，进行缩小范围
			for(;n<array[i].length;){
				//如果这列的最后一个比目标小 就 略过这一列
				if(array[array.length-1][n]<target){
					n++;
				}else{
					break;
				}
			}
			
			//已经缩小的范围
			for(int j=n;j<array[i].length;j++){
				
				if(array[i][j]==target){
					//找到目标
					return true;
				}
				
			}
			
		}
		
		return false;
    }
    
    
    
}