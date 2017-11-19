package cn.edu.henu.subject11;

import org.junit.Test;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 
 * @author StephenChen9527
 * 
 * 
 * 牛人 blog ：http://15838341661-139-com.iteye.com/blog/1642525
 * 
 * 神仙打架：https://stackoverflow.com/questions/109023/how-to-count-the-number-of-set-bits-in-a-32-bit-integer
 */

public class Solution {
    public int NumberOf1(int n) {
    	if(n<0){
    		
    	}
    	System.out.println(Integer.toBinaryString(n));
    	String x=Integer.toBinaryString(n);
    	int count =0;
    	for (char c : x.toCharArray()) {
			if(c=='1'){
				count++;
			}
		}
    	System.out.println(count);
    	System.out.println(Integer.bitCount(n));
    	return 0;
    }
    
    public static void main(String[] args) {
		new  Solution().NumberOf1(100);
	}
    
    
    @Test
    public void test1(){
    	
    	int n=-100;
    	System.out.println(Integer.bitCount(n));
    	int count=0;
    	while(n!=0){
    		if(n%2!=0){
    			count++;
    		}
    		n=n>>>1;
    	}
    	System.out.println(count);
    	
    }

    
}
