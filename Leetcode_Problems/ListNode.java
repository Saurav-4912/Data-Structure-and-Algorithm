
// Leetcode : 203
// Problem Link : https://leetcode.com/problems/remove-linked-list-elements/?envType=problem-list-v2&envId=linked-list
 
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
   
    public ListNode removeElements(ListNode head, int val) {
    
        while(head != null && head.val == val){
    		head = head.next;
    	}

    	if(head == null){
    		return head;
    	}
    	ListNode T = head;
    	while(T.next != null){
    		if(T.next.val == val){
    			T.next = T.next.next;
    		}else{
    			T = T.next;
    		}
    	}
    	return head;
    
    }
}