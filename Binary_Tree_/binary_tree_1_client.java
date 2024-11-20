package Binary_Tree_;

public class binary_tree_1_client {
    public static void main(String[] args) {
        binary_tree_1 bt=new binary_tree_1();
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        bt.Display();
        System.out.println(bt.max());
        System.out.println(bt.find(150));
        System.out.println(bt.ht());
    }
    
}
