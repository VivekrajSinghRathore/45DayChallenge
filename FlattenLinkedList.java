/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
      if(root == null || root.next == null){
          return root;
      }
      Node mergedHead = flatten(root.next);
      return mergeLinkedList(root,mergedHead);
        
    }
    public Node mergeLinkedList (Node t1, Node t2){
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        while(t1 != null && t2 != null){
            if(t1.data < t2.data){
                res.bottom = t1;
                res = t1;
                t1 = t1.bottom;
            }else{
                res.bottom = t2;
                res = t2;
                t2 = t2.bottom;
            }
            res.next = null;
        }
        if (t1 != null) res.bottom = t1;
        else res.bottom = t2;
        return dummyNode.bottom;
    }
}