package lec39;

public class practice_list_client {
    public static void main(String[] args) throws Exception{
        practice_list ll=new practice_list();

        ll.addfirst(10);
        ll.addfirst(30);
        ll.addlast(5);

    //     ll.addatindex(2,8);
    //     System.out.println(ll.getfirst());
    //     System.out.println(ll.getlast());

    // System.out.println(ll.getatindex(2));

    System.out.println(ll.removeatindex(1));

        ll.print();
        
    }
    
}
