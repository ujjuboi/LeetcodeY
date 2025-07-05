package easyProblems;

import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      int[] arr = {2,2,2,3,3};
      LuckyInteger li = new LuckyInteger();
      System.out.println(li.findLucky(arr));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private int findLucky(int[] arr) {
        Map<Integer, Integer> freqCount = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(freqCount.keySet().contains(arr[i])){
                freqCount.put(arr[i], freqCount.get(arr[i]) + 1);
            } else {
                freqCount.put(arr[i], 1);
            }
        }
        int luckyInt = -1;
        for(Integer i: freqCount.keySet()){
            if(i == freqCount.get(i) && i>luckyInt){
                luckyInt = i;
            }
        }
        return luckyInt;
    }
}
