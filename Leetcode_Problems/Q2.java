/**
 * Definition for singly-linked list.
 * public class ListNode
  {
 * int val;
 * ListNode next;

 * ListNode() {}
 
 * ListNode(int val)
  { 
    this.val = val; 
    }
 * ListNode(int val, ListNode next) {
     this.val = val; 
     this.next = next;
      }
 * }
 */
class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

  ListNode head = null , last = null;
  int carry=0;

  while(l1!=null && l2!=null){
      int sum = carry + l1.val + l2.val;

      carry = sum / 10;
      sum = sum % 10;

      ListNode T = new ListNode(sum);

      if(head == null){
          head = T;
          last = T;
      }else{
          last.next = T;
          last = last.next;
      }
     l1 = l1.next;
      l2 =l2.next;
  }

  while(l1!=null ){
      int sum = carry + l1.val ;

      carry = sum / 10;
      sum = sum % 10;

      ListNode T = new ListNode(sum);

      if(head == null){
          head = T;
          last = T;
      }else{
          last.next = T;
          last = last.next;
      }
     l1 =l1.next;
     
  }
    while(l2!=null ){
      int sum = carry + l2.val ;

      carry = sum / 10;
      sum = sum % 10;

      ListNode T = new ListNode(sum);

      if(head == null){
          head = T;
          last = T;
      }else{
          last.next = T;
          last = last.next;
      }
      l2 = l2.next;
     
  }

  if(carry==1){
      ListNode T = new ListNode(carry);
      last.next = T;
      last = last.next;
  }

  return head;
}
}