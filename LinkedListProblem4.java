//Find the intersection of two linked list
public class LinkedListProblem4 {
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
              System.out.print(temp.val+"->");
              temp=temp.next;
          }
          System.out.print("null");
          System.out.println();
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
    private static ListNode intersect(int i,ListNode list1,ListNode list2) {
        if(i==-1){
            return list2;
        }
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(list1!=null && list1.val!=i){
            list1=list1.next;
        }
        if (list1 != null) {
            temp.next = list1;
        }
        return list2;
    }
    public static void main(String[] args) {
        ListNode list1 = make(1,55,8,14);
        print(list1);
        ListNode list2 = make(23,6,4,7);
        list2 = intersect(-1,list1,list2);
        print(list2);
        System.out.println(findintersect(list1,list2));
    }
    private static ListNode findintersect(ListNode l1, ListNode l2) {
        ListNode list1=l1;
        ListNode list2=l2;
        int llist1=0,llist2=0;
        while(list1!=null){
            llist1++;
            list1=list1.next;
        }
        while(list2!=null){
            llist2++;
            list2=list2.next;
        }
        list1=l1;
        list2=l2;
        int diff= Math.abs(llist2-llist1);
        if(llist1>llist2){
            for(int i=1;i<=diff;i++){
                list1=list1.next;
            }
        }
        else{
            for(int i=1;i<=diff;i++){
                list2=list2.next;
            }
        }
        while(list1!=list2){
            // if(list1==null || list2==null){
            //     return null;
            // }
            list1=list1.next;
            list2=list2.next;
        }
        return list1;
    }

}
