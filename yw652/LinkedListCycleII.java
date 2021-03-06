package yw652;

//Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

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
 * 
 * Below is an algorithm that utilizes 3 pointers in total; 
 * More efficiently, one could use only slow and fast pointers: 
 * When slow and fast meet, set the fast to the beginning of the list and start moving at 1 node at a time
 * until it meets slow again, at where is the begin of the cycle
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        
        //Advancing the position first
        ListNode fast = head;
        ListNode slow = head;
        
        //While fast isn't null and fast.next isn't null
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            //If detect intersection
            if(fast == slow){
                //Initialize a pointer at the start of the list
                ListNode curr = head;   
                
                //A loop that keeps checking until the beginning of the cycle is found
                while(true){
                    //When the slow pointer meets the initializing pointer
                    //That's where the cycle begins
                    if(slow == curr){
                        return curr;
                    }
                    //Otherwise keep advancing 
                    curr = curr.next;
                    slow = slow.next;
                }
            
            }
        }
        //If the list has reached the end and no cycle found, then return null;
        return null;
    }
}
