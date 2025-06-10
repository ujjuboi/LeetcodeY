package easyProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxDifferenceBetweenEvenAndOdd{
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      MaxDifferenceBetweenEvenAndOdd md = new MaxDifferenceBetweenEvenAndOdd();
      System.out.println(md.maxDifference("aaaaabbc"));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private int maxDifference(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(freqMap.keySet().contains(s.charAt(i))){
                freqMap.put(s.charAt(i), freqMap.get(s.charAt(i)) + 1);
            } else {
                freqMap.put(s.charAt(i), 1);
            }
        }
        List<Integer> oddFreq = new ArrayList<>();
        List<Integer> evenFreq = new ArrayList<>();
        for(Integer i: freqMap.values()){
            switch(i%2){
                case 0:
                    evenFreq.add(i);
                    break;
                case 1:
                    oddFreq.add(i);
                    break;
            }
        }
        Collections.sort(oddFreq);
        Collections.sort(evenFreq);
        return oddFreq.get(oddFreq.size()-1) - evenFreq.get(0);
    }
}
