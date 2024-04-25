package lec_36;
import java.util.*;

import lec_36.stack_imple;

public class stack_impl_cleint {
    public static void main(String[] args)throws Exception {
        stack_imple st=new stack_imple();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(60);
        // st.push(70);
        // System.out.println(st.pop());
        System.out.println(st.peak());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
st.display();
   
    }
    
}
