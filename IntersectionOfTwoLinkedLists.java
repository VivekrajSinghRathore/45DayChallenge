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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     int n1 =0;
     int n2=0;
     ListNode temp1 = headA;
     ListNode temp2 = headB;
     while(temp1!=null){
        n1++;
        temp1 = temp1.next;
     }
     while(temp2!= null){
        n2++;
        temp2= temp2.next;
     }
      if(n1 > n2 )return collision(headA,headB,n1-n2);
      else return collision(headB,headA,n2-n1);   
    }
    public ListNode collision(ListNode largerNode,ListNode smallerNode,int diff){
    ListNode temp1 = largerNode;
     ListNode temp2 = smallerNode;
        while(diff > 0){
            diff--;
            temp1 = temp1.next;
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}