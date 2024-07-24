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

        //Space complexity 0(n)

        // HashMap<ListNode, Integer> map = new HashMap<>();
        // ListNode temp = head;
        // int count = 0;
        // while(temp != null)
        // {
        //     if(map.get(temp) != null)
        //     {
        //         return temp;
        //     }
        //     else
        //     {
        //         map.put(temp, count++);
        //         temp = temp.next;
        //     }
        // }

        // return null;

        // Optimal space

        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                if(slow == head)
                    return slow;
                slow = head;
                while(fast != null && fast.next != null)
                {
                    slow = slow.next;
                    fast = fast.next;
                    if(slow == fast)
                        return slow;
                }
            }
        }

        return null;
    }
}