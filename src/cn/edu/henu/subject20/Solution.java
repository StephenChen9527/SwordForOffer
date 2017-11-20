package cn.edu.henu.subject20;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 * @author StephenChen9527
 *
 */
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	if(pushA.length==0 || popA.length==0 ||pushA.length!= popA.length)
    		return false;
    	Stack<Integer> stack =new Stack<Integer>();
    	int i=0;
    	int j=0;
    	while(i<pushA.length || j<popA.length){
    		//如果 stack 是空的 或者  栈顶不等于 popA  就 入栈， 并且需要i<lenght
    		if(i<pushA.length && (stack.isEmpty() || stack.peek()!=popA[j])){
    			stack.push(pushA[i++]);
    			continue;
    		}
    		//如果顶不等于 pop  且 i==length 说明 就可以 判断是 错误的了。
    		if(stack.peek()!=popA[j] && i==pushA.length){
    			break;
    		}
    		//出栈
    		stack.pop();
    		j++;
    	}
    	if(i==pushA.length && j==popA.length)
    		return true;
    	else 
    		return false;
    	
    }
    public static void main(String[] args) {
		int[] pushA={1,2,3,4,5};
		int[] popA={1,2,3,4,5};
		System.out.println(new Solution().IsPopOrder(pushA, popA));
		
	}
}
