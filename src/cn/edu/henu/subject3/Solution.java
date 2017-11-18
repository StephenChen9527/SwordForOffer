package cn.edu.henu.subject3;

import java.util.ArrayList;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * @author StephenChen9527
 *
 */
public class Solution {
	ArrayList<Integer> list=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	if(listNode!=null){
    		printListFromTailToHead(listNode.next);
    		//添加
    		list.add(listNode.val);
    	}
	   return list;
	}
    
    
}