package binary_tree.tree_3node;

import java.util.Scanner;

public class Binary_tree {
    class Node{
    int val;
    Node left;
    Node right;
    }
    private Node root;

    public Binary_tree(){
        root=CreateTree();
    }
    Scanner sc=new Scanner (System.in);
    private  Node CreateTree(){
   int item=sc.nextInt();
   Node nn=new Node();
   nn.val=item;
   boolean hlc=sc.nextBoolean();
   if(hlc){
    nn.left=CreateTree();
   }
   boolean hrc=sc.nextBoolean();
   if(hrc){
    nn.right=CreateTree();
   }
   return nn;
    }
    public void Display1(){
        Display(root);
    }
    private void Display(Node node){
        if(node==null){
            return;
        }
        String s="";
        s="<---"+node.val+"--->";
    
    if(node.left!=null){
        s=node.left.val+s;
    }
    else{
        s="."+s;

    }
    if(node.right!=null){
        s=s+node.right.val;
    }
    else{
        s=s+".";
    }
    System.out.println(s);
    Display(node.left);
    Display(node.right);
}


public int max(){
    return max(root);
    
}
private int max(Node nn){
    if(nn==null){
        return Integer.MIN_VALUE;
    }
    int left=max(nn.left);
    int right=max(nn.right);
    return Math.max(left,Math.max(right,nn.val));

}
public boolean find(Node node,int item){
    if(node==null){
        return false;
    }
    if(node.val==item){
        return true;
    }
    boolean left=find(node.left,item);
    boolean right=find(node.right, item);
    
   return left||right;
}



public int height(){
    return height(root);
}
private int height(Node node){
    if(node==null){
        return 0;
    }
    int lh=height(node.left);
    int rh=height(node.right);

    return Math.max(lh,rh)+1;
}

}

