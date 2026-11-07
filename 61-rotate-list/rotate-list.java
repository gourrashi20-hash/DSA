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
    public ListNode rotateRight(ListNode head, int k) {
          if (head == null || head.next == null || k == 0) {
            return head;
        }

       ListNode tail=head;
       int length=1;
       while(tail.next!=null){
        length++;
        tail=tail.next;
       }
       if(k%length==0){
        return head;
       }
       k=k%length;
       tail.next=head;
       ListNode temp=head;
       int current=1;
       while(current<length-k){
        temp=temp.next;
        current++;
       }
       
       head=temp.next;
       temp.next=null;
       return head;
    }
}