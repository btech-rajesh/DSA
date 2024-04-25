package lec40;
import java.util.*;
public class intersection_list {
    // public static void main(String[] args) {
    //  class ListNode {
    //             int val;
    //             ListNode next;
    //             ListNode(int x) {
    //                  val = x;
    //                  next = null;
    //              }
    //          }
            
    //        public class Solution {
    //            public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //             ListNode ra=headA;
    //             ListNode vgra=headB;
    //             while(ra!=vgra){
    //                 if(ra==null){
    //                     ra=headB;
    //                 }
    //                 else{
    //                     ra=ra.next;
    //                 }
    //                 if(vgra==null){
    //                     vgra=headA;
    //                 }
    //                 else{
    //                     vgra=vgra.next;
    //                 }

    //             }
                   
    //             return vgra;
            //    }
        //    }
    // }
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),k=sc.nextInt();
  LinkedList<Integer>ll=new LinkedList<>();
  for(int i=1;i<=n;i++){
      ll.add(i);
  }
System.out.println(ll+" ");



    }
}
