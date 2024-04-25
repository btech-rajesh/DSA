package lec39;



public class link_list_client {
    public static void main(String[] args) throws Exception {
         link_list ll=new link_list();
        ll.addFirst(10);
        ll.addFirst(20);
        // ll.addFirst(30);
        // ll.addFirst(40);
        // ll.addFirst(50);

        ll.addLast(60);
        ll.addLast(7);

        ll.addatindex(2,4);

    // System.out.println(    ll.getatindex(2));
    // System.out.println(ll.getfirst());
    // System.out.println(ll.getlast());
    // System.out.println(ll.removeFirst());
    // System.out.println(ll.removelast());
    // System.out.println(ll.removeatindex(2));
   
        ll.print_list();
        

     
    }
    
}
