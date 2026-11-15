class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        int count = 0;

        while(count < k) {
            if(temp == null) {
                return head;
            }
            temp = temp.next;
            count++;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        count = 0;

        while(count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = reverseKGroup(curr, k);

        return prev;
    }
}