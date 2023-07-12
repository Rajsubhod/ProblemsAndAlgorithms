//Given a linked list we want to delete a node in the linked list where the node is given as a paramenter instead of head

import java.util.Arrays;
import java.util.List;

public class LinkedListProblem1 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
      //Printing LinkedList
      public static void print(ListNode head){
          ListNode temp = head;
          while(temp!=null){
              System.out.print(temp.val+" ");
              temp=temp.next;
          }
      }
      //Making LinkedList
      public static ListNode make(int... val){
          if(val.length<=0){
              return new ListNode();
          }
          ListNode node = new ListNode(val[val.length-1]);
          for(int i=val.length-2;i>=0;i--){
              node = new ListNode(val[i],node);
          }
          return node;     
      }
    //This function not actually deleting the node but copying the data of the next node into it then deleting the next node or better to say bypassing it.
    public static ListNode deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        return node;
    }
    public static void main(String[] args) {
        ListNode list = make(1,5,8,2,33,7,14);
        print(list);
        System.out.println();
        ListNode del = list.next.next;//8
        deleteNode(del);
        print(list);
    }
}
