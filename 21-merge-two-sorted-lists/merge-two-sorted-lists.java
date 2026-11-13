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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode rhead=list2;
        ListNode lhead=list1;
        while(rhead!=null && lhead!=null){
        if(lhead.val<rhead.val){
                temp.next=lhead;
                
                lhead=lhead.next;
            }
       else{
        temp.next=rhead;
        rhead=rhead.next;
       }
       temp=temp.next;
        }
        if(lhead!=null){
            temp.next=lhead;
        }
        if(rhead!=null){
            temp.next=rhead;
        }
        return dummy.next;
    }
}