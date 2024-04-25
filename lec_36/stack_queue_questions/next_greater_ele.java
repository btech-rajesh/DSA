package lec_36.stack_queue_questions;

import java.util.*;

public class next_greater_ele {
    public static void main(String[] args) {
        int []arr={50,11,9,7,13,3};
        Stack<Integer>st=new Stack<>();
        nextLarger(arr,st);
        
    }
   
        
  public static void nextLarger(int[] arr,Stack<Integer>st) {
int ans[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			while(!st.isEmpty() && arr[i]>arr[st.peek()]){
				ans[st.pop()]=arr[i];
			
			}

		
			
				st.push(i);

			
					}
					while(!st.isEmpty()){
						ans[st.pop()]=-1;
					}
				
			
			for(int i=0;i<ans.length;i++){
				System.out.println(arr[i]+","+ans[i]);
				// System.out.println(ans[i]+" ");
			}


	}
    
}
