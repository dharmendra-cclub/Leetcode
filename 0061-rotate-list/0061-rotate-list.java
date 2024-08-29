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
        if(head == null || head.next == null)   return head;
        int count = 0;
        ListNode temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        k = k % count;
        System.out.println(k);
        for(int i = 0; i < k; i++)
        {
            temp = head;
            if(temp.next != null)
            {
                 while(temp.next.next != null)
                {
                    temp = temp.next;
                }
                temp.next.next = head;
                head = temp.next;
                temp.next = null;
            }
        }

        return head;
    }
}