package dp_bhaiay;

import java.util.Arrays;

public class valentine_magic {
    public static void main(String[] args) {
        int b[]={2,11,3};
        int g[]={5,7,3,2};
        Arrays.sort(b);
        Arrays.sort(g);

        System.out.println(Min_Diff(b, g, 0, 0));

    }
    public static int Min_Diff(int []b,int []g,int i,int j){
        if(i==b.length){
            return 0;
        }
        if(j==g.length){
            return 666666;
        }
        int sel=Math.abs(b[i]-g[i])+Min_Diff(b, g, i+1, j+1);
        int rej=Min_Diff(b, g, i, j+1);
        return Math.min(sel,rej);

       
    }
}
