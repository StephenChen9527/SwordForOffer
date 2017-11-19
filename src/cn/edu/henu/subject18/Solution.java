package cn.edu.henu.subject18;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字， 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14
 * 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * 
 * @author StephenChen9527
 *
 */
public class Solution {
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(matrix.length==0 || matrix[0].length==0){
			return list;
		}
		int row=matrix.length;
		int col=matrix[0].length;
		int n=0;
		while(true){
			for(int i=n;i<(col-n)&&list.size()<(row*col);i++){
				list.add(matrix[n][i]);
			}
			for(int i=n+1;i<(row-n)&&list.size()<(row*col);i++){
				list.add(matrix[i][col-1-n]);
			}
			for(int i=col-n-1;i>n&&list.size()<(row*col);i--){
				list.add(matrix[row-n-1][i-1]);
			}
			for(int i=row-n-1;i>n+1&&list.size()<(row*col);i--){
				list.add(matrix[i-1][n]);
			}
			n++;
			if(list.size()>=(row*col)){
				break;
			}
			
		}
		
		return list;
	}
	public static void main(String[] args) {
		int arr[][]={
				{1,2,3,4,5,6}};
		System.out.println(new Solution().printMatrix(arr).toString());
	}
}
