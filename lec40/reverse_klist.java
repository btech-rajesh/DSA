package lec40;
import java.util.*;

import lec40.cycle_list.ListNode;
public class reverse_klist {
   
   
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode(int x) {
//         val = x;
//     }
// }

//     public static void main (String args[]) {
//         Scanner sc=new Scanner(System.in);
      
//   int n=sc.nextInt(),k=sc.nextInt();
//    ListNode head = new ListNode(sc.nextInt());
//         ListNode current = head;

//         for (int i = 1; i <=n; i++) {
//             current.next = new ListNode(sc.nextInt());
//             current = current.next;
//         }

 
// head=reverse_k(head,k);
// printList(head);
// sc.close();




//     }
//     public static ListNode reverse_k(ListNode head,int k){

//         ListNode pre=null;
//         ListNode curr=head;
//         ListNode next=null;
//         int count=0;
//     // ListNode ahead=curr.next;
//         while(count<k && curr!=null){
//             next=curr.next;
//             curr.next=pre;
//             pre=curr;
//             curr=next;
//             count++;


//         }
//             if(next!=null){
//                 head.next=reverse_k(head,k);
//             }

        
//         return pre;
//     }

//          public static void printList(ListNode node) {
//         while (node != null) {
//             System.out.print(node.val + " ");
//             node = node.next;
//         }
        
//     }
public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
public static void main(String[] args) {
    int n=5;
    LinkedList<Integer>l=new LinkedList<>();
    for(int i=1;i<=n;i++){
        l.add(i);
    }
   odd_evNode(head,n);
}
public static ListNode odd_evNode(LinkedList<Integer>l,int n){

    for(int i=0;i<n;i++){
        if(l(i).val%2==0){
            
        }
    }

}


    }

    
