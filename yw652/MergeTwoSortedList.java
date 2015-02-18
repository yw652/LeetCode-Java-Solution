package yw652;

//Merge two sorted linked lists and return it as a new list. 
//The new list should be made by splicing together the nodes of the first two lists.

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
        
        //When one of the list becomes empty and the other is not
        //Add the rest of the list to the end of the combined sorted list (No need to traverse the rest of the list one by one)
        
        while(curr1 != null){
            //p.next = curr1;
            p.next = curr1;
            curr1 = curr1.next;
            p = p.next;
        }
        while (curr2 != null){
            //p.next = curr2;
            p.next = curr2;
            curr2 = curr2.next;
            p = p.next;
        }
        
        return dummy.next;
    }
}
