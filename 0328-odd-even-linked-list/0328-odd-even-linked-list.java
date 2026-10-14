/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode odd= head;
        ListNode even=head.next;
        ListNode e=even;
        ListNode curr=even.next;

        int x=3;
        while(curr!=null){
           if(x%2==0){ 
            e.next=curr;
            e=e.next;
           }
           else {
            odd.next=curr;
            odd=odd.next;
           }
           
           
           curr=curr.next;
           x++;       
        }
        e.next = null; 
        odd.next=even;
        return head;
    }
}