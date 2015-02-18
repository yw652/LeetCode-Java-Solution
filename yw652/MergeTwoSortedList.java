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
public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        
        ListNode dummy = new ListNode(0);
        //Initialize a new list with a dummy node at the beginning
        ListNode p = dummy;
        while(curr1 != null && curr2 != null){
            if (curr1.val > curr2.val){
                p.next = curr2;
                curr2 = curr2.next;
            } else{
                p.next = curr1;
                curr1 = curr1.next;
            }
            //Advance the pointer for p so that the next call p.next is empty for the next node
            p = p.next;
        }
            
        while(curr1 != null){
            p.next = curr1;
            curr1 = curr1.next;
            p = p.next;
        }
        while (curr2 != null){
            p.next = curr2;
            curr2 = curr2.next;
            p = p.next;
        }
        
        return dummy.next;
    }
}