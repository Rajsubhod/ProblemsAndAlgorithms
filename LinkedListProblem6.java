//Delete the middle element of linkedlist
public class LinkedListProblem6 {
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
              System.out.print(temp.val+" -> ");
              temp=temp.next;
          }
          System.out.print("null"+'\n');

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
    public static void main(String[] args) {
        ListNode list = make(1,5,8,2,33,7);
        print(list);
        print(deleteMID(list));
    }
    private static ListNode deleteMID(ListNode list) {
        //This means there are only one elments then delete first or last elemnet
        //Here we are deleting first one
        //If we are given two elements and to delete right one then the while can do it but if its said left then while will give error for that write this at start
        /*
         if(list.next.next==null){
            return list.next;
         }
         */
        if(list.next==null){
            return null;
        }
        ListNode slow=list;
        ListNode fast=list;
        //Deletes middle node when there are odd number of nodes
        //This deletes the left middle node of linked list when there are even number of node
        // while(fast.next.next.next!=null && fast.next.next.next.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        //Deletes middle node when there are odd number of nodes
        //This deletes the right middle node of linked list when there are even number of node
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return list;
    }
}
