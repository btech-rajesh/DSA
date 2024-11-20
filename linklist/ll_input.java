package linklist;
import java.util.*;
class ListNode{
    int val;
    ListNode next;



    ListNode(int val){
        this.val=val;
        this.next=null;

    }


}
public class ll_input {



   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        ListNode node=createList(n,sc);
        Display(node);
        
    }

    public static ListNode createList(int n,Scanner sc){

        ListNode node=new ListNode(-1);
        ListNode dummy=node;
        for(int i=0;i<n;i++){
            dummy.next=new ListNode(sc.nextInt());
            dummy=dummy.next;

        }
        return node.next;



    }

    public static void Display(ListNode head){
        while(head!=null){
            System.out.println(head.val+" ");

            head=head.next;
            
        }
    }

    
}
