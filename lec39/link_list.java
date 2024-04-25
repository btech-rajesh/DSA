package lec39;

public class link_list {

    class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    //add,remove,get,display,size;
    
    public void addFirst(int item){
        Node nn=new Node();//by creating obj first node will created
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
    public int removeFirst(){
        Node temp=head;
        if(size==1){
            head=null;
            tail=null;
            size--;
        }
        else
       { 
        head=head.next;
        temp.next=null;
        size--;
      
}
return temp.val;
    }
    // O(N)
    public int removelast() throws Exception{
        if(size==1){
            return removeFirst();
        }
        else{
           Node prev=GetNode(size-2);
           int rv=tail.val;
           tail=prev;
           tail.next=null;
           size--;

           return rv;
        }
        
    }

    public int removeatindex(int k) throws Exception{
        if(k==0){
            return removeFirst();
        }
       else if(k==size-1){
            return removelast();
        }
        else{
            Node curr=GetNode(k);
            Node prev=GetNode(k-1);
            int rv=curr.val;
            prev.next=curr.next;
            
            curr.next=null;
            size--;

            return rv;


        }
    }
    public void addLast(int item){
        if(size==0){
            addFirst(item);
        }
        else{
            Node nn=new Node();
            nn.val=item;
            tail.next=nn;
            tail=nn;
            size++;

        }
    }
    public void addatindex(int k,int item)throws Exception{
        if(k==0){
            addFirst(item);
        }
        else if(k==size){
            addLast(item);
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
            throw new Exception("k is not in range");
        }
        Node temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public int getfirst(){
        return head.val;
    }
    // O(1)
    public int getlast(){
        return tail.val;
    }

    //O(N)
    public int getatindex(int k)throws Exception{
        return GetNode(k).val;

    }

        public void print_list(){
             Node temp=head;
             while(temp!=null){
                System.out.print(temp.val+"-->");
                temp=temp.next;
             }
             System.out.println("Null");
        }

    
}
