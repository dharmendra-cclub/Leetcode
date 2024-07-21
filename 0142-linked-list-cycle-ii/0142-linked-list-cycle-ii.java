/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            if(map.get(temp) != null)
            {
                return temp;
            }
            else
            {
                map.put(temp, count++);
                temp = temp.next;
            }
        }

        return null;
    }
}