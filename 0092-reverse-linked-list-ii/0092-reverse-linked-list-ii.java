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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;
        ListNode leftNode = null, rightNode = null, beforeLeft = null;
        ListNode t = head;
        int indx = 1;
        while(t != null){
            if (indx == left - 1) beforeLeft = t;
            if(indx == left){
                leftNode = t;
            }
            if(indx == right){
                rightNode = t;
                break;
            }
            t = t.next;
            indx++;
        }
        ListNode curr = leftNode;
        ListNode prev = null;
        ListNode temp;
        ListNode afterRight = rightNode.next;
        while(curr != afterRight){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        if(beforeLeft != null){
            beforeLeft.next = rightNode;
        }else{
            head = rightNode;
        }
        leftNode.next = afterRight;
        return head;
    }
}