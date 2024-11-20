package lec_46;
//kya final variavle ko change kr skte obj bnake
public class final_demo {
    int x=9;
    final int  y;
    public final_demo(int x,int y){
        this.x=x;
        this.y=y;
    }
    public static void main(String[] args) {
        final_demo f=new final_demo(2,9);
        System.out.println(f.x+" "+f.y);

        final_demo f1=new final_demo(12,19);
        System.out.println(f1.x+" "+f1.y);
    }
}
