package lec_36.stack_queue_questions;

import java.util.Stack;

public class smal_no_di {
    public static void main(String[] args) {
        String s="IIIDIDDD";
       System.out.println( small_no(s));
       
    }
    public static String small_no(String s){
        int val=1;
        int ans[]=new int [s.length()+1];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || s.charAt(i)=='I'){// here 1st condition is for the check if their is D in str then we putting values  or filling value
           ans[i] =val;
            val++;
            while(!st.isEmpty()){// here by fetching the index value for D we can use pop ans place value of ans arr;
              ans[st.pop()]=val;
              val++;
            }
                
            }
            else{// here stack will store the index for D 
                st.push(i);

            }
        }
       String answ="";
       for(int i=0;i<ans.length;i++){
        answ+=ans[i];
       }
       return answ;
    }
    
}
