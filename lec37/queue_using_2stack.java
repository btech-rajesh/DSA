package lec37;
import java.util.*;

public class queue_using_2stack {
    Stack<Integer>s1;
    Stack<Integer>s2;
queue_using_2stack(){
    s1=new Stack<>();
    s2=new Stack<>();
}
public void enqueue(int item){
    s1.push(item);
}

public int dequeue(){
    if(s2.isEmpty()){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
    }
    return s2.pop();
}


public boolean isEmpty() {
    return s1.isEmpty() && s2.isEmpty();
}

   
// public int peek(){
//     if(s2.isEmpty()){
//         while(!s1.isEmpty()){
//             s2.push(s1.pop());
//         }
//     }
//     return s2.peek();
// }
}
