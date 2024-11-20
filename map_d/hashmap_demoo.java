package map_d;
import java.util.*;
// import java.util.TreeMap;
public class hashmap_demoo {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();//here order an tc is o(n) as data is not sorted
        //add
        map.put("raj",34);
        map.put("ankur",44);
        map.put("rajesh",30);
        map.put("manish",40);
        map.put("raj",37);//latest value will be add into map only and at end it will override it
        // System.out.println(map.put(null,45));//null key 
        System.out.println(map);

//         //get
//         System.out.println(map.get("raj"));
//         System.out.println(map.get("shiva"));
//         System.out.println(map);
//         //remove provide value which will renove
//         System.out.println(map.remove("manish"));//40
//         System.out.println(map.remove("rajesh"));//30
//         System.out.println(map.remove("shyam"));//null

//         //contains
//         System.out.println(map.containsKey("raj"));
//         System.out.println(map.containsKey("shivam"));


//         // can we have a null as key =>yes
//         // 

   
// TreeMap<String,Integer>map1=new TreeMap<>();//here order is log(n) as data is sorted
// // data structure is used here is redblack
// //here key is not null  
// //add
// map1.put("raj",34);
// map1.put("ankur",44);
// map1.put("rajesh",30);
// map1.put("manish",40);
// map1.put("aman",78);
// map1.put("sona",89);
// System.out.println(map1);


LinkedHashMap<String,Integer>map1=new LinkedHashMap<>();
// to preserve order we use linked hashmap =>jis way m add krenge usi trike se data o/p milega
// implete by doubly linkedlist
// here key allow as a null
//add
map1.put("raj",34);
map1.put("ankur",44);
map1.put("rajesh",30);
map1.put("manish",40);
map1.put("aman",78);
map1.put("sona",89);
System.out.println(map1);

// to print the all3 map
// we use=>
// Set<String>s=map1.keySet();
for(String key:map.keySet()){
    System.out.println(key+" "+map.get(key));
}


    }
    
}
