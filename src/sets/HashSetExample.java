package sets;


import java.util.Collections;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // defining hashset
        HashSet<String> set1 = new HashSet<String>();

        set1.add("Mango");
        set1.add("Grapes");
        set1.add("Guava");
        set1.add("Banana");
        set1.add(null);
        set1.add("Mango");
        System.out.println("set1 is "+set1);

        set1.remove("Mango");
        System.out.println("set1 after remove is "+set1);

        // size of map
        System.out.println("Length of set1 is : "+set1.size());

        // trvaersing the map
        // foreach loop
        System.out.println("Using foreach loop prinitng the data");
        for(String l1 : set1){
            System.out.println(l1);
        }

    }
}
