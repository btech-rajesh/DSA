package tree_data;

public class Node {
    // int key;
    // Node left,right;

    // Node(int item){
    //     key=item;
    //     left=right=null;



    // }
    // public static void main(String[] args) {
    //     Node root=new Node(3);
    //     Node first=new Node(5);
    //     root.left=first;
    //     Node second =new Node(6);
    //     root.right=second;
        
    // }
    public static void main(String[] args) {
        int []nums={5,-3,5};
        int n=nums.length;
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,sum1=0,total=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]%n;
            max=Math.max(max,sum);
            System.out.println(max);
            if(sum<0){
                System.out.println(max);
            }

        }
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        System.out.println("distribution");
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i]%n;
            min=Math.min(min,sum);
        
            // System.out.println(min);
        }
        System.out.println(total-min);
        
       
      
    }
    
}
