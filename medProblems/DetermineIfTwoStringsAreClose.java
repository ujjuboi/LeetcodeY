import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetermineIfTwoStringsAreClose {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      DetermineIfTwoStringsAreClose di = new DetermineIfTwoStringsAreClose();
      System.out.println(di.closeStrings("abc", "bca"));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        Map<Character, Integer> mapWord1 = new HashMap<>();
        for(int i=0; i<word1.length(); i++){
            if(mapWord1.keySet().contains(word1.charAt(i))){
                mapWord1.put(word1.charAt(i), mapWord1.get(word1.charAt(i)) + 1);
            } else {
                mapWord1.put(word1.charAt(i), 1);
            }
        }
        Map<Character, Integer> mapWord2 = new HashMap<>();
        for(int i=0; i<word2.length(); i++){
            if(mapWord2.keySet().contains(word2.charAt(i))){
                mapWord2.put(word2.charAt(i), mapWord2.get(word2.charAt(i)) + 1);
            } else {
                mapWord2.put(word2.charAt(i), 1);
            }
        }
        if(mapWord1.keySet().equals(mapWord2.keySet())){
            List<Integer> mapValues1 = new ArrayList<Integer>(mapWord1.values());
            List<Integer> mapValues2 = new ArrayList<Integer>(mapWord2.values());
            Collections.sort(mapValues1);
            Collections.sort(mapValues2);
            if(mapValues1.equals(mapValues2)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
