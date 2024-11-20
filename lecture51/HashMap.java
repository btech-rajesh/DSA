package lecture51;
import java.util.*;
public class HashMap <K,V> {
    class Node{
   K    key;
   V    value;
        Node next;
    }
    // Node[]arr=new Node[5];
    
    ArrayList<Node> bukt;
    private int size=0;
    public HashMap(){
        this(4);
    }
    public HashMap(int n){
        bukt=new ArrayList<>();
        for(int i=0;i<n;i++){
            bukt.add(null);
        }
    }
    public void put(K key,V value){
        int idx=hashfun(key);
        Node temp=bukt.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                temp.value=value;

            }
            temp=temp.next;
        }
        temp=bukt.get(idx);
        Node nn=new Node();
        nn.key=key;
        nn.value=value;
        nn.next=temp;

        bukt.set(idx,nn);
        size++;

    }
    public V remove(K key){
        int idx=hashfun(key);
        Node curr=bukt.get(idx);
        Node prev=null;
        while(curr!=null){
            if( curr.key.equals(key)){
                break;



            }
            prev=curr;
            curr=curr.next;
        }
                if(curr==null)
        {
            return null;
        }   
        if(curr==null){
            bukt.set(idx,curr.next);
            size--;
        }
 }
    public V get(K key){
        int idx=hashfun(key);
        Node temp=bukt.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
               return temp.value;
            }
            temp=temp.next; 
          
        }
        return null;

    }
    public boolean containsKey(K key){
        int idx=hashfun(key);
        Node temp=bukt.get(idx);
        while(temp!=null){
            if(temp.key.equals(key)){
                return true;

            }
            temp=temp.next;
    }
    return false;
}

    public int hashfun(K key){
        int bn=key.hashCode() % bukt.size();
        if(bn<0){
            bn+=bukt.size();
        }
        return bn;
    }
   
}