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
    public boolean isPalindrome(ListNode head) {
        int sizeOfLinkedList = 0;
        ListNode temp = head;
        while(temp != null){
            sizeOfLinkedList++;
            temp = temp.next;
        }
        int size = sizeOfLinkedList/2;
        ListNode revLinkedListHead = head;
        ListNode previous = null;
        while(size > 0){
            previous = revLinkedListHead;
            revLinkedListHead = revLinkedListHead.next;
            size--;
        }
        if (previous != null) {
            previous.next = null;
        }
        ListNode first = head;
        ListNode rev = getReversedLinkedList(revLinkedListHead);
        while(rev != null &&  first != null){
            if(rev.val != first.val){
              return false;
            }
            rev = rev.next;
            first = first.next;
        }
        return true;
        

    }
    public ListNode getReversedLinkedList(ListNode revLinkedList){
        ListNode prev = null;
        ListNode curr = revLinkedList;
        while (curr != null) {
            ListNode next = curr.next; 
            curr.next = prev;          
            prev = curr;               
            curr = next;            
        }
        return prev;
    }
}