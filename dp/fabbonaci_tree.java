package dp;

import java.util.ArrayList;
// import java.util.List;

public class fabbonaci_tree {
    public static void main(String[] args) {
        // int f=0,s=1;
        // for(int i=2;i<6;i++){
        //     int temp=f+s;
        //     f=s;
        //     s=temp;
        // }
        // System.out.println(s);
    //     int arr[]=new int[5];
    //    System.out.println(fabbo(5,arr));
        
    // }
    // public static int fabbo(int n,int []dp){
    //     if(n==1 || n==0){
    //         return n;
    //     }
    //     if(dp[n]!=0){
    //         return dp[n];
    //     }

    //  int a=fabbo(n-1,dp);
    //     int b=fabbo(n-2,dp);

    //     return dp[n]=a+b;
    int []arr={1,3,5};
    ArrayList<Integer>list=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=0;j<arr.length;j++){
            for(int k=i;k<=j;k++){
                sum+=arr[k];
        
        System.out.print(arr[k]);
            }
     System.out.println();
        }
        
    }

    }
}
