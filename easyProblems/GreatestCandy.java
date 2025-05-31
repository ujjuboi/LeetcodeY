package easyProblems;

import java.util.ArrayList;
import java.util.List;

public class GreatestCandy {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        // Do something
        GreatestCandy gc = new GreatestCandy();
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        List<Boolean> result = gc.kidsWithCandies(candies, extraCandies);
        for(boolean i : result){
            System.out.print(i + " ");
        }
        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
    }
    
    private List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestCandies = candies[0];
        List<Boolean> result = new ArrayList<>();
        for(int i: candies){ 
            if(i > greatestCandies){
                greatestCandies = i;
            }
        }
        for(int i: candies){ 
            if(i+extraCandies >= greatestCandies){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
