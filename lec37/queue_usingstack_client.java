package lec37;
import java.util.*;
public class queue_usingstack_client {
    public static void main(String[] args) {
   queue_using_2stack q=new queue_using_2stack();
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
q.enqueue(i);
        }

      
        while(!q.isEmpty()){
            System.out.print(q.dequeue()+" ");
        }
    }
   
    
}
