package yw652;

//Given a linked list, determine if it has a cycle in it.

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
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        //If fast hasn't reached the end of the list, neither is slow, so no need to check
        //Check fast and fast.next to make sure that fast pointer can move forward (no exception prompted)
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
