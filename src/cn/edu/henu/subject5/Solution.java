package cn.edu.henu.subject5;
/**
 * 
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。
 *  队列中的元素为int类型。
 *  思路：
 *  队列是 先进先出 FIFO
 *  栈是后进先出
 *  利用一个临时栈当成临时存放 数据栈 中 已经存在的数据，
 *  然后 在 将 缓冲栈 返回到 数据栈中，完成数据的颠倒。
 *  
 * @author StephenChen9527
 */
import java.util.Stack;

public class Solution {
	//缓冲栈
    Stack<Integer> tempStack = new Stack<Integer>();
    //数据栈
    Stack<Integer> dataStack = new Stack<Integer>();
    
    public void push(int node) {
    	//如果数据栈中已经存在数据，将数据弹出，放入到 缓冲栈中
        while(dataStack.size()>0){
        	tempStack.push(dataStack.pop());
        }
        //数据进入到数据站的0号位置
        dataStack.push(node);
        //缓冲栈弹回数据栈，完成顺序颠倒
        while(tempStack.size()>0){
        	dataStack.push(tempStack.pop());
        }
    }
    
    public int pop() {
    	//数据栈返回最顶层的，就是最先入栈的
        return dataStack.pop();
    }
}