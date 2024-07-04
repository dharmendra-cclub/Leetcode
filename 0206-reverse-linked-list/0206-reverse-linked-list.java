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
    static ListNode newHead = null;
    public ListNode reverseList(ListNode head) {
        //Code for iterative approach

        // ListNode prev = null;
        // ListNode front = head;
        // ListNode current = head;
        // while(current != null)
        // {
        //     front = front.next;
        //     current.next = prev;
        //     prev = current;
        //     current = front;
        // }

        // return prev;

        reverse(null, head);

        return newHead;
        
    }

    public void reverse(ListNode prev, ListNode current)
    {
        if(current != null)
        {
            reverse(current, current.next);
            current.next = prev;
        }
        else
            newHead = prev;
    }
}