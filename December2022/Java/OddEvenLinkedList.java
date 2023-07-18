
// Problem Link: https://leetcode.com/problems/odd-even-linked-list/description/

// author: Mahesh Reddy B N

class Solution {
    public ListNode oddEvenList(ListNode head) {
    if(head ==null || head.next ==null || head.next.next == null) return head;
    ListNode odd = head;
    ListNode even = head.next;
    ListNode evenStart = head.next;
    while( odd.next!= null && even.next != null  ){
        odd.next = even.next;
        odd = odd.next;
        even.next = odd.next;
        even = even.next;
    }
    odd.next = evenStart;
    return head;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return head;
        if (head.next == null || head.next.next == null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        
        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            
            if (odd != null) {
                even.next = odd.next;
                even = even.next;
            }
        }
        
        odd.next = evenHead;
        return head;
    }
}
