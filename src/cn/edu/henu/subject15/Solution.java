package cn.edu.henu.subject15;
/**
 * 
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 * @author StephenChen9527
 *
 */
public class Solution {
	public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head=null;
    	ListNode list3=null;
    	while(true){
    		if(list1==null || list2==null){
    			break;
    		}
    		
    		if(list1.val<list2.val){
    			if(head==null){
    				list3=list1;
    				head=list3;
    				list1=list1.next;
    			}else{
    				list3.next=list1;
                    list3=list3.next;
    				list1=list1.next;
    				
    			}
    		}else{
    			if(head==null){
    				list3=list2;
    				head=list3;
    				list2=list2.next;
    			}else{
    				list3.next=list2;
                    list3=list3.next;
    				list2=list2.next;
    			}
    			
    		}
    		
    	}
    	while(list1!=null){
    		if(head==null){
				list3=list1;
				head=list3;
				list1=list1.next;
			}else{
				list3.next=list1;
                list3=list3.next;
				list1=list1.next;
				
			}
    	}
    	while(list2!=null){
    		if(head==null){
				list3=list2;
				head=list3;
				list2=list2.next;
			}else{
				list3.next=list2;
                list3=list3.next;
				list2=list2.next;
			}
    		
    	}
        return head;
    }
}
