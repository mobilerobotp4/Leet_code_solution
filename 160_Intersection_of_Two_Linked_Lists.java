//Please see the leetcode for the problem
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
        if(headA == null || headB == null) return null;
        
        Set<ListNode> set = new HashSet<>();
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        
        while (pointerA != null) {
            set.add(pointerA);
            pointerA = pointerA.next;
        }
        
        while (pointerB != null) {
            if (!set.add(pointerB)) {
                return pointerB;
            }
            pointerB = pointerB.next;
        }
		
        return null;
        
    }
}
