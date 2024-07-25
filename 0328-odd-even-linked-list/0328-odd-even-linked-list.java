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
        ListNode temp = head;
        ListNode temp2 = null;
        ListNode second = head.next;
        int count = 0;

        while(temp.next != null)
        {
            count++;
            temp2 = temp.next;
            if(temp2.next == null && count % 2 != 0)
            {
                temp.next = second;
                return head;
            }
            temp.next = temp2.next;
            temp = temp2;
        }

        temp.next = second;

        return head;
    }
}