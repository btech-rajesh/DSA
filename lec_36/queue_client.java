package lec_36;
public class queue_client {
    public static void main(String[] args) throws Exception {
        queue_java q=new queue_java();
    q.Enqueue(10);
    q.Enqueue(20);
    q.Enqueue(30);
    q.Enqueue(40);
    q.Display();
    System.out.println(q.Dqueue());
    System.out.println(q.Dqueue());
    q.Enqueue(50);
    q.Enqueue(60);
    q.Display();

        
    

    }
    
}
