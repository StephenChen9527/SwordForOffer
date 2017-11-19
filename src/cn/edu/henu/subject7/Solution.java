package cn.edu.henu.subject7;
/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 * @author StephenChen9527
 *
 */
public class Solution {
    public int Fibonacci(int n) {
    	if(n<=0)
			return 0;
		int[] arr =new int[n];
		int i=n;
		while(n>0){
			if(n>i-2){
				arr[--n]=1;
			}else{
				arr[--n]=arr[n+1]+arr[n+2];
			}
		}
		return arr[n];
    }
}