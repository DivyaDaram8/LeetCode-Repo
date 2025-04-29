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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // int size = 0;
        // ListNode temp = head;
        // while(temp != null){
        //     size++;
        //     temp = temp.next;
        // }

        // if (n == size) {
        //     return head.next;
        // }

        // int iToFind = size - n;
        // ListNode prev = head;

        // for(int i = 1; i < iToFind; i++){
        //     prev = prev.next;
        // }
        // prev.next = prev.next.next;
        // return head;
        ListNode dummy = new ListNode(0);
        ListNode fast = dummy;
        ListNode slow = dummy;
        dummy.next = head;

        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }
        
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}