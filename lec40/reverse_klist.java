package lec40;
import java.util.*;

// import lec40.cycle_list.ListNode;
public class reverse_klist {
    public static void main(String[] args) {
    int arr[]={4,5,0,-2,-3,1};
    int sum=0;
    int count=0;
    int l=5;
    int n=arr.length;
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            for(int k=i;k<=j;k++){
               if(arr[k]>arr[k-1]){
                count++;
               }
    

    }
    // System.out.println("");
    }

    System.out.println(count);
    }
   
    }}

   

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
        
//    }
    