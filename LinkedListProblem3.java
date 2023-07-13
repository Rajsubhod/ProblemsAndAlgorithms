//Removing nth node from the end of linkedlist
public class LinkedListProblem3 {
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
    public static void main(String[] args) {
        ListNode list = make(1,5,8,2,33,7,14);
        print(list);
        System.out.println();
        int n = 7;
        print(delete(list,n));
    }
    //Time Complexity --- O(n)
    private static ListNode delete(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<=n;i++){
            // if(fast.next!=null)
            fast=fast.next;   
            // else
            //     head=slow.next;
        }
        if(fast==null){
            return head.next;
        }
        //traversing to the node right before nth node 
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //connecting previous node of nth node to its next node
        slow.next=slow.next.next;
        return head;
    }
}
