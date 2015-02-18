package yw652;

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
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //Setting 2 pointers
        ListNode p = dummy;
        ListNode q = dummy;
        int count = 0;
        while(p.next != null){
            if(count >= n){
                q = q.next;
            }
            p = p.next;
            count++;
        }
        if(q.next != null){
            q.next = q.next.next;
        }
        return dummy.next;
    }
}