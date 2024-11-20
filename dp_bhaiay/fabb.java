package dp_bhaiay;

public class fabb {
    public static void main(String[] args) {
        int n=5;
        int[]dp=new int[n+1];
        System.out.println(fabTD(n,dp));
        System.out.println(fabbBU( n));
    }
public static int fabbBU(int n){
    int []dp=new int[n+1];
    dp[0]=0;
    dp[1]=1;
    for(int i=2;i<dp.length;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
}
    public static int fabTD(int n,int []dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int n1=fabTD(n-1,dp);
        int n2 =fabTD(n-2,dp);
        return dp[n]= n1+n2;
    }
    
}
