package lec40;

import java.util.Scanner;
class ListNode{
    int val;
    ListNode next;
    

    ListNode(int val){
        this.val=val;
        this.next=null;
    }

}

public class reverse_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ListNode list = createList(sc, n);

    
     
    
      
    
    }
    public static ListNode createList(Scanner sc, int size) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;}

    
}
