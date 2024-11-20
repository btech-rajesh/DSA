package lec_46;

public class pair <K,v> {//if class is generic then methods is make generic auto
   K x:
   v y:
   public pair(K x,v y){
    this.x=x;
    this.y=y;

   }
   public pair(){

   }
   public static void main(String[] args) {
    pair<Boolean,Integer>p=new pair<Boolean,Integer>();
    pair<Long,Integer>p1=new pair<Long,Integer>();
    pair<Boolean,Character>p2=new pair<Boolean,Character>();


   }
   
    
}
