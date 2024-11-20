import java.util.Arrays;

public class count_sort {
    public static void main(String[] args) {
        int []arr={2,1,1,0,1,2,5,4,0,2,8,7,9,2,6,1,9};
   sort(arr);
        
    }
    public static void sort(int []arr){
        int max=Arrays.stream(arr).max().getAsInt();//to get max element
        int[]fre=new int [max+1];
        for(int i=0;i<arr.length;i++){
            fre[arr[i]]++;
            
        }
        for(int i=1;i<fre.length;i++){
            fre[i]=fre[i-1]+fre[i];
        }

        System.out.println(Arrays.toString(fre));

    }
}
