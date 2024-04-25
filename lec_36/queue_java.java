package lec_36;
public class queue_java {

    private int []arr;
    private int front=0;
    private int size;

    public queue_java(){
        arr=new int [5];
    }
    public queue_java(int n){
        arr=new int [n];
    }

    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }

    public int size(){
        return size;
    }

    public void Enqueue(int item) throws Exception{
        if(isFull()){
          throw new Exception("queue is full");
        }
        int ind=(front+size)%arr.length;
        // int ind=front+size; //for linear queue
        arr[ind]=item;
        size++;
       
       
    }
    public int Dqueue()throws Exception{
        if(isEmpty()){
          throw new Exception("queue is empty");
        }
 
 int v= arr[front];
        front=(front+1)%arr.length;
        // front++; //linear queue
        size--;
        return v;
    }

    public int getFront()throws Exception{
        if(isEmpty()){
          throw new Exception("queue is empty");
        }
        int v=arr[front];
        return v;

    }
    public void Display(){
        for(int i=0;i<size;i++){
            int ind=(front+i)%arr.length;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
