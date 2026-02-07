package ie.atu.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison{
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        //adding elements
        for(int i = 0; i < 10; i++){
            arrayList.add("item " + i);
            linkedList.add("item "+ i);
        }
        //accessing random element in arraylist
        System.out.println("ArrayList element at index 5: " + arrayList.get(5));

        long start = System.nanoTime();
        arrayList.get(5);
        long end = System.nanoTime();
        System.out.println("ArrayList access time: " + (end - start) + " ns");

        System.out.println();

        //accessing random element in lnkedlist
        System.out.println("LinkedList element at index 5: " + linkedList.get(5)); 
        start = System.nanoTime();
        linkedList.get(5);
        end = System.nanoTime();
        System.out.println("LinkedList access time: " + (end - start) + " ns");
        
        System.out.println();

        //insertion in the middle
        arrayList.add(6, "added element");
        linkedList.add(6, "added element");
        System.out.println("ArrayList after insertion: " + arrayList);
        start = System.nanoTime();
        arrayList.get(6);
        end = System.nanoTime();
        System.out.println("ArrayList access time: " + (end - start) + " ns");

        System.out.println();


        System.out.println("LinkedList after insertion: " + linkedList);
        start = System.nanoTime();
        arrayList.get(6);
        end = System.nanoTime();
        System.out.println("ArrayList access time: " + (end - start) + " ns");
    }
}