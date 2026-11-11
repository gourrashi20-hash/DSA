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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        int pos = 1;

        while(pos < left) {
            prev = prev.next;
            pos++;
        }

        ListNode curr = prev.next;
        ListNode next;

        int gos = left;

        while(gos < right) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
            gos++;
        }

        return dummy.next;
    }
}