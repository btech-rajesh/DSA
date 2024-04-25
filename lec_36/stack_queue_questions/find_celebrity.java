package lec_36.stack_queue_questions;

import java.util.Stack;

public class find_celebrity {
    public static void main(String[] args) {
        int arr[][]={{0,0,1,0},{0,0,1,0},{0,0,0,0},{0,0,1,0}};
        Celebrity(arr);
        // System.out.println(Celebrity(arr));
    }
    public static void  Celebrity(int [][] arr){
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }
        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            if(arr[a][b]==1){
                st.push(b);

            }
            else{
                st.push(a);
            }
        }
            int can=st.pop();//element left in stack after the elimination e.g=2;
            for(int i=0;i<arr.length;i++){
                if(i==can){//for i=2=2;
                    continue;
                }
                if(arr[can][i]==1 || arr[i][can]==0){
                 System.out.println("no celebrity");
                }
            }
        
        
      System.out.println(can);
        
    }
    
}
