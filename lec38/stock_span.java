package lec38;

import java.util.Stack;

public class stock_span {
    public static void main(String[] args) {
        int []arr={30,35,40,38,35};
        cal_span(arr);
    }
 
    public static void cal_span(int []arr){
        int []ans =new int[arr.length];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(!s.isEmpty()){ //here we just calculated stock span value
                ans[i]=i-s.peek();


            }
            else{
                ans[i]=i+1;
            }
            s.push(i);

        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
