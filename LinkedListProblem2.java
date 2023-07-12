//Find the nth node from the end of the linkedlist
public class LinkedListProblem2 {
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
        int n = 3;
        System.out.println(findNode(list,n).val);
        System.out.println(findNodeB(list, n).val);
    }
    //Time Complexity --- O(n)
    //Uses one traversal
    private static ListNode findNodeB(ListNode head ,int n) {
        ListNode slow = head;
        ListNode fast = head;
        //move the fast pointer n steps in linked list from head or current position
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        //move fast and slow pointer one step ahead until fast becomes null then slow is on n steps from last
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    //Time complexity --- O(n)
    //Uses two traversal
    private static ListNode findNode(ListNode head ,int n) {
        ListNode temp = head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        temp=head;
        int m = length-n+1;
        for(int i=1;i<m;i++){
            temp=temp.next;
        }
        return temp;
    }
}
