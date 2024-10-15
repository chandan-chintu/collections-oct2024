package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // defining hashmap
        HashMap<Integer, String> map1 = new HashMap<>();

        // adding data in to hashmap
        map1.put(101,"Mango");
        map1.put(102,"Grapes");
        map1.put(103,"Mango");
        map1.put(104,"Guava");
        map1.put(null,"Pineapple");
        map1.put(101,"Banana");// overides mango and prints banana
        map1.put(103,"Strawberry"); // overides mango anf prints strawberry

        System.out.println("map1 is : "+map1);

        // length of map
        System.out.println("map1 length is : "+map1.size());

        // get particular element in map
        System.out.println("map1 element with key 104 : "+map1.get(104));

        // remove data
        map1.remove(103);
        System.out.println("map1 after removing : "+map1);

        // traverse the map
        System.out.println("traversing the map using foreach loop");
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey()+"---------"+m1.getValue());
        }

    }
}
