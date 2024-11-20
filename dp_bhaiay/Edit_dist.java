package dp_bhaiay;

import java.util.Arrays;

public class Edit_dist {
    
    public static void main(String[] args) {
        String word1="food";
        String word2="money";
        int dp[][]=new int[word1.length()][word2.length()];
        for(int i=0;i<dp.length;i++){
        Arrays.fill(dp[i],-1);
        }
       System.out.println( min(word1,word2,0,0,dp));
        
    }
    public static int min(String s,String t,int i,int j,int [][]dp){
        if(s.length()==i){
            return t.length()-j;
        }
        if(j==t.length()){
            return s.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(s.charAt(i)==t.charAt(j)){
            ans=min(s,t,i+1,j+1,dp);
        }
        else{
            int d=min(s,t,i+1,j,dp);
            int r=min(s,t,i+1,j+1,dp);
            int I=min(s,t,i,j+1,dp);
            ans=Math.min(r,Math.min(d,I))+1;
        }
        return dp[i][j]=ans;
    }
}
