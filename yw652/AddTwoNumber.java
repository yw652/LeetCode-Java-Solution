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
public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) return null;
        
        //The value calculated at each level
        int level = 0;
        
        ListNode head1 = l1;
        ListNode head2 = l2;
        // Dummy node for the sum linked list
        ListNode sum = new ListNode(0);
        ListNode pointer = sum;
        
        //While the current node at either list is not null
        while(head1 != null || head2 != null){
            //if head1 has value
            if (head1 != null){
                //Increment the total at current position
                level += head1.val;
                //Advance the head1 pointer on l1
                head1 = head1.next;
            }
            //If head2 has value
            if (head2 != null){
                //Increment the total at current position
                level += head2.val;
                //Advance the pointer position
                head2 = head2.next;
            }
            //The sum at the corresponding position is the sum or the mod of 10 is sum > 10
            pointer.next = new ListNode(level % 10);
            //Advance the level if sum > 10 at the previous level
            level /= 10;
            pointer = pointer.next;
        }
        if (level > 0){
            pointer.next = new ListNode(1);
        }
        return sum.next;
    }
}