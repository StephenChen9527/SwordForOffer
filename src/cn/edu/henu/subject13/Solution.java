package cn.edu.henu.subject13;
/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * 复制一个数组 
 * 从左侦测奇数，放入左边，
 * 从右侦测偶数，放入右边。
 *@author StephenChen9527
 */

public class Solution {
    public void reOrderArray(int [] array) {
        int temp[]=new int[array.length];
        System.arraycopy(array, 0, temp, 0, array.length);
		int left=0;
		int right=array.length-1;
		for(int i=0;i<temp.length;i++){
			if(temp[i]%2!=0){
				array[left++]=temp[i];
			}
			if(temp[temp.length-1-i]%2==0){
				array[right--]=temp[temp.length-1-i];
			}
		}
    }
}
