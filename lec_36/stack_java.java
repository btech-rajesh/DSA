package lec_36;
import java.util.*;

public class stack_java {
    public static void main(String[] args) {
       Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
    
        // st.pop();
       System.out.println( st.peek());//print upper element of an stack
        System.out.println(st.size());



    }
    
}
