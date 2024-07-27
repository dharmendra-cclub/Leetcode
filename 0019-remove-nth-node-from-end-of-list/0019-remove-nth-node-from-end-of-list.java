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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode back = head;
        ListNode front = head;
        int count = 0;

        if(head == null || head.next == null)
            return null;

        while(count != n)
        {
            front = front.next;
            count++;
        }
        if(front == null)
        {
            head = head.next;
            return head;
        }
        while(front.next != null)
        {
            back = back.next;
            front = front.next;
        }
        
        back.next = back.next.next;

        return head;
    }
}