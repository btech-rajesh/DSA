package binary_tree.bfs;
import java.util.*;

public class Node {
    int val;
    Node left;
    Node right;

    public Node(int data){
        val=data;
    }

    public static List<List<Integer>>levelordertraversal(Node root){
        List<List<Integer>>list=new ArrayList<>();
        if(root==null){
            return list;
        }

        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                l.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            list.add(l);
        }


    return list;

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        
    }
    
}
