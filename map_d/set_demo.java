package map_d;
import java.util.*;
public class set_demo {
    // set is the interface and it is impleted by 3 =>hashset,TreeSet,LinkedHashSet
    //set always have a unique data means key and value is diffrent
    // it removes the duplicacy
    // no order for print

 public static void main(String[] args) {
//     HashSet<Integer> set=new HashSet<>();//o(n)
//     // add
//     set.add(2);
//     set.add(12);
//     set.add(23);
//     set.add(90);
//     set.add(-1);
//     set.add(-1);
// System.out.println(set);

// // contains
// System.out.println(set.contains(2));
// System.out.println(set.contains(45));

// System.out.println();
// // remove

// System.out.println(set.remove(90));
// System.out.println(set.remove(85));
// System.out.println(set);

// for(int v:set){
//     System.out.println(v +" ");
// }


// TreeSet<Integer> set1=new TreeSet<>();//log(n)
//     // add
//     set1.add(2);
//     set1.add(12);
//     set1.add(23);
//     set1.add(90);
//     set1.add(-1);
//     set1.add(-1);
// System.out.println(set1);


LinkedHashSet<Integer> set=new LinkedHashSet<>();//o(n)

    // add
    set.add(2);
    set.add(12);
    set.add(23);
    set.add(90);
    set.add(-1);
    set.add(-1);
System.out.println(set);

 }
    

}
