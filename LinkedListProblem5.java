//Find the middle element of linked list in one iteration
public class LinkedListProblem5 {
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
        ListNode list = make(1,5,8,2,33,7,14);
        print(list);
        print(findMID(list));
    }
    //Time Complexity --- O(n)
    private static ListNode findMID(ListNode list) {
        if(list.next.next==null){
            return list;
        }
        ListNode slow = list;
        ListNode fast = list;
        //Gives middle node when there are odd number of nodes
        //This gives the left middle node of linked list when there are even number of node
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //Gives middle node when there are odd number of nodes
        //This gives the right middle node of linked list when there are even number of node
        // while(fast!=null && fast.next!=null){
        //     fast=fast.next.next;
        //     slow=slow.next;
        // }
        return slow;
    }
}
