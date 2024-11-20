package dp_bhaiay;

import java.util.Arrays;

public class Lon_inc_sub {
    public static void main(String[] args) {
        int []nums={10,9,2,5,3,7,101,18};
        System.out.println(lis(nums));
    }
    public static int lis(int []nums){
        int []dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<dp.length;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    int x=dp[j];
                    dp[i]=Math.max(dp[i],x+1);
                }
            }
        }
        return Arrays.stream(nums).max().getAsInt();
    }
}
