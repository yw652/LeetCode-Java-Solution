package yw652;

/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

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
public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pre = head;
        
        while(pre != null){
            ListNode cur = pre.next;
            while(cur != null && pre.val == cur.val){
                cur = cur.next;
            }
            pre.next = cur;
            pre = pre.next;
        }
        return head;
    }
}
