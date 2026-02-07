
package ie.atu.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            List<Integer> numsList = new ArrayList<>();
            numsList.add(10);
            numsList.add(20);
            numsList.add(30);

            System.out.println(numsList);



            System.out.println();
            System.out.println("Exercise 2");


            String[] words = {"ipad", "computer", "phone"};

            ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));

            wordList.add("headphones");

            System.out.println(wordList);

            
            System.out.println();
            System.out.println("Exercise 3");

    }
}