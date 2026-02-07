package ie.atu.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BasicIterator{
    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        colours.add("pink");
        colours.add("blue");
        colours.add("black");
        

        //using basic iterator
        Iterator<String> iterator = colours.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        //using listiterator for advanced features
        ListIterator<String> listIterator = colours.listIterator();

        System.out.println("Forward iteration: ");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println();

        System.out.println("Backward iteration: ");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        
        System.out.println();

        listIterator = colours.listIterator(2);
        listIterator.add("green");

        listIterator = colours.listIterator();
        while(listIterator.hasNext()){
            String more = listIterator.next();
            if(more.equals("black")){
                listIterator.set("purple");
            }
        }
        System.out.println("\nUpdated list:" + colours);
        
    }
}