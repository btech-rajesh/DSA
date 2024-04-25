package lec37;

import java.sql.Array;
import java.util.*;

public class queue_reverse {
   
    public static void main(String[] args) {
        int arr[]=new int [5];
    Queue<Integer> q=new PriorityQueue<>() {
        
    };
   
    // q.Enqueue(10);
    // q.Enqueue(20);
    // q.Enqueue(30);
    // q.Enqueue(40);
    // q.Enqueue(50);
     q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.add(50);
   
    Reverse(q);


    }
    public static void Reverse(Queue q){
        if(q.isEmpty()){
            return;
        }
        // int x=q.remove();
        Reverse(q);
        // q.add(x);
    }
}
