package Binary_Tree_;
import java.util.*;
public class binary_tree_1 {
    class Node {
		int val;
		Node left;
		Node right;
	}
private Node root;
public binary_tree_1(){
    root=createtree();
}
Scanner sc=new Scanner(System.in);
public Node createtree(){
int item=sc.nextInt();
Node nn=new Node();
nn.val=item;
boolean hlc=sc.nextBoolean();
if(hlc){
    nn.left=createtree();
}
boolean hrc=sc.nextBoolean();
if(hrc){
    nn.right=createtree();
}
return nn;

}
public void Display() {
    Display(root);
}

private void Display(Node node) {//here root is private so we have created a new function same which is public 
    if (node == null) {
        return;
    }

    String s = "";
    s = "<--" + node.val + "-->";
    if (node.left != null) {
        s = node.left.val + s;
    } else {
        s = "." + s;
    }
    if (node.right != null) {
        s = s + node.right.val;
    } else {
        s = s + ".";
    }
    System.out.println(s);
    Display(node.left);
    Display(node.right);
}
public int max(){
    return max(root);
}
    private int max(Node nn){
        if(nn==null){
            return Integer.MIN_VALUE;
        }
        int lmax=max(nn.left);
        int rmax=max(nn.right);
        return Math.max(nn.val,Math.max(lmax,rmax));

    }
    public boolean find(int item) {

		return find(root, item);
	}

	private boolean find(Node node, int item) {
		
		if (node == null) {
			return false;
		}

		if (node.val == item) {
			return true;
		}
		boolean left = find(node.left, item);
		boolean right = find(node.right, item);
		return left || right;

	}
    public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		if (node == null) {
			return 0;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;
	}

}
