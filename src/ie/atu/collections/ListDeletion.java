package ie.atu.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListDeletion {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(8);
        nums.add(16);
        nums.add(20);


        nums.remove(Integer.valueOf(16));
        System.out.println("After removing 16: " + nums);

        nums.remove(0);
        System.out.println("After removing element at index 0: " + nums);

        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext()){
            int num = iterator.next();
            if(num == 20){
                iterator.remove();
            }
        }
        System.out.println("After iterator removal: " + nums);
    }
}
