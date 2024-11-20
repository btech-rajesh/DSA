package lec_46;

public class generics_demo {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,6};
        Display(arr);
        String[]arr1={"raj","sucha","monu","pushpa","ram"};
        Display(arr1);
    }
    public static <Jhanvi> void Display(Jhanvi []arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    
}
