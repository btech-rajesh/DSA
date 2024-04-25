package lec38;

import java.util.Stack;

public class lar_histogram {
    public static void main(String[] args) {
        int []arr={2,3,5,4,6,1,7};
        int n=area(arr);
        System.out.println(n);
    }
    public static int area(int []arr){
        Stack<Integer>s=new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty()&& arr[i]<arr[s.peek()]){
                int h=arr[s.pop()];
                int r=i;

            
            if(!s.isEmpty()){
                int l=s.peek();
                ans=Math.max(ans,h*(r-l-1));

            }
            else{
                ans=Math.max(ans,h*r);
            }
        }
        s.push(i);
    }
    int r=arr.length;
    while(!s.isEmpty()){
        int h=arr[s.pop()];
        

    
    if(!s.isEmpty()){
        int l=s.peek();
        ans=Math.max(ans,h*(r-l-1));

    }
    else{
        ans=Math.max(ans,h*r);
    }
}



    
    return ans;
}
}
