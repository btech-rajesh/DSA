package dp_bhaiay;

public class knapsack {
    public static void main(String[] args) {
        int cap=4;
        int[] wt={1,2,3,2,2};
        int[]val={8,4,0,5,3};
        int dp[][]=new int[wt.length][val.length];
        System.out.println(knapsack(wt, val, cap, 0));
        
    }
    public static int knapsack(int[]wt,int[]val,int cap,int i){
        if(i==wt.length || cap==0){
            return 0;
        }
        int inc=0,exc=0;
        if(cap>=wt[i]){
            inc=val[i]+knapsack(wt, val, cap-wt[i], i+1);
        }
        exc=knapsack(wt, val, cap, i+1);
        return Math.max(exc,inc);
    }

}