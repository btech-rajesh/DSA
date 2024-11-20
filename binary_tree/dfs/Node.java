package binary_tree.dfs;


public  class Node{
    int val;
    Node left;
    Node right;

        Node (int val){
            this.val=val;
        }
       public static int level(Node root){
            if(root==null){
                return 0;
            }
            int left=level(root.left); 
            int right=level(root.right);
            // int rightLevel = findlevel(root.right);
            
            return 1 + Math.max(left, right);
        }
        public static void main(String[] args) {
            Node root=new Node(1);
            root.left=new Node(2);
            root.right=new Node(3);
            root.left.left=new Node(90);
            root.left.right=new Node(100);

            root.right.left=new Node(5);
            root.right.right=new Node(6);
           int n= level(root);
           System.out.println(n);
    
        }
}