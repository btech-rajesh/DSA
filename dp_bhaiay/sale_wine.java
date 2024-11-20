package dp_bhaiay;

import lec_46.stack1;

public class sale_wine {
    public static void main(String[] args) {
        int a[]={2,3,5,1,4};
        System.out.println(maximum_profit(a));
        // System.out.println(Max_pro(a, 0,a.length-1,1));

    }
    public static int maximum_profit(int []a){
        int[][]dp=new int[a.length][a.length];
        int year=a.length;

        // this is for the diagonal condition 
        for(int i=0;i<a.length;i++){
            dp[i][i]=a[i]*year;
        }
        year--;
        // this is for uppercase condition
        for(int gap=1;gap<dp.length;gap++){
            for(int j=gap;j<dp.length;j++){
                int i=j-gap;
                int f=a[i]*year+dp[i+1] [j];
                int l=a[j]*year+dp[i][j-1];
                dp[i][j]=Math.max(f,l);

            }
            year--;
        }
        return dp[0][dp[0].length-1];

    }
    public static int Max_pro(int a[],int i,int j,int year){
        if(i>j){
            return 0;
        }
        int f=a[i]*year+Max_pro(a, i+1, j, year+1);
        int l=a[j]*year+Max_pro(a, i, j-1, year+1);

        return Math.max(f,l);

    }
}
