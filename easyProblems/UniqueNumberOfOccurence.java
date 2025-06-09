package easyProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurence {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      int[] arr = {1,2,2,1,1,3};
      UniqueNumberOfOccurence un = new UniqueNumberOfOccurence();
      System.out.println(un.uniqueOccurrences(arr));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurenceMap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(occurenceMap.keySet().contains(arr[i])){
                occurenceMap.put(arr[i], occurenceMap.get(arr[i]) + 1); 
            } else {
                occurenceMap.put(arr[i], 1);
            }
        }
        Set<Integer> valuesSet = new HashSet<Integer>(occurenceMap.values());
        if(occurenceMap.keySet().size() != valuesSet.size()){
            return false;
        }
        return true;
    }

}
