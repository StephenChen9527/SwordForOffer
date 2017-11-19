package cn.edu.henu.subject19;
import java.util.ArrayList;
/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * ps:感觉可以接着精简
 * @author StephenChen9527
 *
 */
import java.util.Stack;

public class Solution {
	Stack<Integer> stack=new Stack<Integer>();
	Stack<Integer> temp=new Stack<Integer>();
    public void push(int node) {
    	stack.push(new Integer(node));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
    	int value=stack.peek();
		return value;
        
    }
    
    public int min() {
    	int min=Integer.MAX_VALUE;
    	while(!stack.isEmpty()){
    		if(stack.peek()<min){
    			min=stack.peek();
    		}
    		temp.push(stack.pop());
    	}
    	while(!temp.isEmpty()){
    		stack.push(temp.pop());
    	}
    	if(min==Integer.MAX_VALUE){
    		return 0;
    	}
		return min;
        
    }
}