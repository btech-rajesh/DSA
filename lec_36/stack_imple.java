package lec_36;

 class stack_imple {
    private int []arr;
    private int ind=-1;
   stack_imple(){
        arr=new int [5];

    }
   stack_imple(int n){
arr=new int [n];
    }

    public boolean isEmpty(){
        return ind==-1;
    }

  
    public boolean isFull(){
        return ind==arr.length-1;
    }
    public int size(){
        return ind+1;
    }
    public void push(int item) throws Exception{
        
        if(isFull()){
          throw new Exception("stack is full");

        }   
      
        ind++;
        arr[ind]=item;
       
      
        
    }
    public int pop() throws Exception{
        if(isEmpty()){
            
            throw new Exception("stack is empty");
            }
        
        ind--;
        return arr[ind];
    }
    public int peak()throws Exception{
        if(isEmpty()){
            
            throw new Exception("stack is empty mere bhai");
            }
       return arr[ind-1];
    }

    public void display(){
       
        for(int i=0;i<=ind;i++){

        System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
