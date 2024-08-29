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
        int count = 1;
        ListNode tail, temp;
        tail = head;
        while(tail.next != null)
        {
            count++;
            tail = tail.next;
        }

        if(k%count == 0)  return head;
        tail.next = head;
        temp = head;
        k = k%count;
        for(int i = 1; i < count - k; i++)
        {
            head = head.next;
        }

        temp = head.next;
        head.next = null;
        head = temp;

        return head;
    }
}