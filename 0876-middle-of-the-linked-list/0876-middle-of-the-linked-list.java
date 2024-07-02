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
    public ListNode middleNode(ListNode head) {
     int count = 1;
     ListNode x = head;
     while(x.next != null)
     {
        count++;
        x = x.next;
     }
     x = head;
     int middle = count/2;
     for(int i = 0; i < middle; i++)
     {
        x = x.next;
     }

     return x;   
    }
}