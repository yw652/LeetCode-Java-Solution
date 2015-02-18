package yw652;


/**
 * Definition for singly-linked list.
   public class ListNode {
	 int val;
 *   ListNode next;
 *   ListNode(int x) {
 *         val = x;
 *         next = null;
 *   }
 * }
 */
public class IntersectionTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        int lengthA = getLen(headA);
        int lengthB = getLen(headB);
        
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        
        while(lengthA != lengthB){
            if (lengthA > lengthB){
                pointerA = pointerA.next;
                lengthA -= 1;
            } else {
                pointerB = pointerB.next;
                lengthB -= 1;
            }
        }
        while(pointerA != null && pointerB != null){
            if (pointerA.val == pointerB.val){
                return pointerA;
            } else{
                pointerA = pointerA.next;
                pointerB = pointerB.next;
            }
        }
        return null;
        
    }
    public int getLen(ListNode head){
        if (head == null) return 0;
        int count = 0;
        ListNode pointer = head;
        while(pointer != null){
            count++;
            pointer = pointer.next;
        }
        return count;
    }
    
}