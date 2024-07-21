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

//Solution with O(n) space complexity

    // public boolean hasCycle(ListNode head) {
    //     ListNode temp = head;
    //     HashMap<ListNode, Boolean> map  = new HashMap<>();
    //     while(temp != null)
    //     {
    //         if(map.get(temp) != null)
    //         {
    //             return true;
    //         }
    //         else
    //         {
    //             map.put(temp, true);
    //             temp = temp.next;
    //         }
                
    //     }

    //     return false;
    // }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
}