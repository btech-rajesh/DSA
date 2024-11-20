package bst;
import java.util.*;

import java.util.LinkedList;
import java.util.Scanner;

import binary_tree.diameter_bt.TreeNode;

public class bst_leveleorder {
    class Node{
        int val;
        Node left;
        Node right;



    }
    private Node root;
    public bst_leveleorder(){
        create_tree();
    }

  Scanner sc=new Scanner(System.in);
  private void create_tree(){

  }
    
  int n=sc.nextInt();
  Node nn=new Node();
  
  nn.val = n;
  root=nn;
  Queue<Node>q=new LinkedList<>();
q.add(nn);
while(!q.isEmpty()){
    Node rn=q.poll();
    int c1=sc.nextInt();
    int c2=sc.nextInt();
    if(c1!=-1){
        Node node=new Node();
        node.val=c1;
        rn.left=node;
        q.add(node);
    }
    if(c2!=-1){
        Node node=new Node();
        node.val=c2;
        rn.left=node;
        q.add(node);
    }
}

}
