/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //Brute force
        ListNode tempA = headA;
        ListNode tempB = headB;
        HashMap<ListNode, Integer> map = new HashMap<>();
        while(tempA != null)
        {
            map.put(tempA, tempA.val);
            tempA = tempA.next;
        }

        while(tempB != null)
        {
            if(map.containsKey(tempB))
                return tempB;
            tempB = tempB.next;
        }

        return null;
    }
}