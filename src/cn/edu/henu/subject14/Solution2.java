package cn.edu.henu.subject14;
/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author StephenChen9527
 *
 */

public class Solution2 {
    public ListNode FindKthToTail(ListNode head,int k) {
    	ListNode node1=head;
    	ListNode node2=head;
    	if(k<0) 
    		return node2;
    	while(node1!=null){
    		node1=node1.next;
    		if(k==0){
    			node2=node2.next;
    		}else{
    			k--;
    		}
    	}
    	if(k>0){
    		return null;
    	}
    	
    	return node2;
    }
}