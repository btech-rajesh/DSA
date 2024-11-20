package binary_tree;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int key){
        data=key;
    }

    // dfs traversal=>Inorder(left,root,right);
    //                    Preorder(root,left,right);
    //                    Postorder(left,right,root);
    

    //preorder traversal
    void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);

    }

    //inorder traversal
    void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    // Post-order traversal
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(5);

        root.inorder(root);
       System.out.println();

        root.preorder(root);
        System.out.println();


        root.postOrder(root);
        

        
  
    }    
}
