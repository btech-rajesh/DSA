package lec39;

import java.io.EOFException;

public class practice_list {
    class Node{
        int val;
        Node next;
    }
   private Node head;
   private Node tail;
   private int size;

    //add,remove,get,display,size;
  
    public void addfirst(int item){
        Node nn=new Node();
        nn.val=item;

        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }

        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    public void addlast(int item){
        if(size==0){
            addfirst(item);
        }
        else{
            Node nn=new Node();
            nn.val=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }

    public void addatindex(int k,int item ) throws Exception{
       if(k==0){
        addfirst(item);
       }
       else if(k==size){
        addlast(item);
       }
       else{
        Node nn=new Node();
        nn.val=item;
       Node k_1th=GetNode(k-1);
   nn.next=k_1th.next;
   k_1th.next=nn;
       size++;

        


       }
    }

   public Node GetNode(int k)throws Exception{
    if(k<0||k>=size){
        throw new Exception("k is not in range for list");
        
    }
    else{
        Node temp=head;
        for(int i=0;i<k;i++){
            temp=head.next;

        }
        return temp;
    }
    
   }
   public int getfirst(){
    return head.val;

   }
   public int getlast(){
    return tail.val;
   }
   public int getatindex(int k) throws Exception{
    return GetNode(k).val;
   }

   public int removeFirst(){
    Node temp=head;
    int rv=0;
    if(size==1){
        head=null;
        tail=null;
        size--;
    }
    else{
    
        head=head.next;
        temp.next=null;
       rv=temp.val;
        size--;


    }
    return rv;
   }
   public int removelast() throws Exception{
    if(size==1){
       return removeFirst();
    }
    else{
        Node prev=GetNode(size-2);
        prev.next=null;
        tail=prev;
        tail.next=null;
        size--;

        return tail.val;

    }
   }
   

   public int removeatindex(int k) throws Exception{
    if(size==1){
        return removeFirst();
    }
    else if(k==size-1){
        return removelast();
    }
    else{
        Node curr=GetNode(k);
        Node prev=GetNode(k-1);
        prev.next=curr.next;
        curr.next=null;
        size--;

        

        return curr.val;
    }

   }
   public void print(){
    Node temp=head;
    while(temp!=null){
       System.out.print(temp.val+"-->");
       temp=temp.next;
    }
    System.out.println("Null");
}


}
