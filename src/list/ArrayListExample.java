package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // define the arraylist
        List<Integer> list1 = new ArrayList<Integer>();

//        int a=10;
//        int b= null; // will not allow null
//
//        float c = null;
//
//        Integer d = 100;
//        Integer f = null; // allows null as well
//
//        Float g = null;


        // adding or inserting data
        list1.add(12);
        list1.add(77);
        list1.add(9);
        list1.add(55);
        list1.add(77);
       // list1.add(null);
        list1.add(66);

        System.out.println("list1 is : "+list1);

        // remove data
        list1.remove(3);  // the 3rd index will get deleted
        System.out.println("list1 after removing 3rd index is : "+list1);

        // searching data at specific postion
        System.out.println("Element at 4th index : "+list1.get(4));
        System.out.println("Element at 2nd index : "+list1.get(2));

        // updating data
        list1.set(2,100);
        System.out.println("list1 after updating : "+list1);

        // size of list
        System.out.println("Length of list1 is : "+list1.size());

        // sort the list
        Collections.sort(list1);
        System.out.println("List1 after sorting : "+list1);

        // trvaersing the list
        // foreach loop
        System.out.println("Using foreach loop prinitng the data");
            for(Integer l1 : list1){
            System.out.println(l1);
        }


        List abc = new ArrayList();
        abc.add(123);
        abc.add("fgh");
        abc.add(12.345);
        System.out.println(abc);

        List<List<Integer>> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        list3.add(34);
        list3.add(22);
        list3.add(5);
        list2.add(list3);

        System.out.println("list inside list traversal");
        for (List<Integer> lists : list2){
            for (Integer l1:lists){
                System.out.println(l1);
            }
        }


    }
}
