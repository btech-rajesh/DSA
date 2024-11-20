package binary_tree.tree_3node;
// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
public class helper_binary {
    public static void main(String[] args) {
        
    
    Binary_tree tree=new Binary_tree();
    tree.Display1();
  System.out.println(tree.max());
  System.out.println(tree.find(null, 10));
  System.out.println(tree.height());
    
}
}
