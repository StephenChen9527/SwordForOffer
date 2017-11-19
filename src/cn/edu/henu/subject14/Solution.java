package cn.edu.henu.subject14;
/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author StephenChen9527
 *
 */
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null ||k<=0){
    		return null;
    	}
    	List<ListNode> nodes=new ArrayList<ListNode>();
    	ListNode node=head;
    	while(node!=null){
    		nodes.add(node);
    		node=node.next;
    	}
    	if(k>nodes.size()){
    		return null;
    	}else{
    		return nodes.get(nodes.size()-k);
    	}
    }
}