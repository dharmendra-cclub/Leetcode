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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = slow;
        ListNode curr = slow.next;
        ListNode temp = slow.next;
        while(curr != null)
        {
            temp = temp.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        temp = head;
        while(temp != slow.next)
        {
            if(temp.val != prev.val)
                return false;
            temp = temp.next;
            prev = prev.next;
        }

        return true;
    }
}