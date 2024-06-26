package lec40;

public class cycle_list {
    class ListNode{
        int val;
        ListNode next;
    
    ListNode(int x){
        val=x;
        next=null;
    }
}
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null || fast.next!=null){
                slow=head.next;
                fast=head.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
            
        }
    }
}
