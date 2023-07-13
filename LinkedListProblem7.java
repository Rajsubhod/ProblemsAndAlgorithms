public class LinkedListProblem7 {
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
    public static void createCycle(ListNode list){
        ListNode temp=list;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=list.next.next.next;
    }   
    public static void main(String[] args) {
        ListNode list = make(1,5,8,2,33,7,14);
        createCycle(list);
        //print(list);
        System.out.println(detecCycle(list));
    }

    private static boolean detecCycle(LinkedListProblem7.ListNode list) {
        ListNode slow=list;
        ListNode fast=list.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
