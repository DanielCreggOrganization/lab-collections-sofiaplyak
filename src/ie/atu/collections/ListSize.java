package ie.atu.collections;

import java.util.ArrayList;
import java.util.List;


public class ListSize {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apples");
        fruits.add("peaches");
        fruits.add("watermelon");
        fruits.add("tangarines");

        //otiginal size
        System.out.println("Number of elements: " + fruits.size());

        System.out.println();

        //adding more fruits
        fruits.add("grapes");
        System.out.println("Number of elements after adding: " + fruits.size());


        //removing more fruits
        fruits.remove(0);
        fruits.remove(1);
        System.out.println("Number of elements after removing: " + fruits.size());
    }
}
