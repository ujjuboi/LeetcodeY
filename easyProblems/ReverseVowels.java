package easyProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReverseVowels {
  public static void main (String args[]){
    final long startTime = System.nanoTime();
    // Do something
    ReverseVowels rv = new ReverseVowels();
    System.out.println(rv.reverseVowels("Ui"));
    final long endTime = System.nanoTime();
    System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private String reverseVowels(String s) {
      HashMap<String, Integer> asciiTable = new HashMap<String, Integer>()
      {{
        put("A", 65); put("E", 69); put("I", 73); put("O", 79); put("U", 85);
      }};
      //do -32 to get smallcase value;
      List<Character> vowels = new ArrayList<>();
      for(int i=0; i<s.length(); i++){
        if(asciiTable.containsValue(s.charAt(i) + 0) || asciiTable.containsValue(s.charAt(i) - 32)){
          vowels.add(s.charAt(i));
          s = s.substring(0, i) + "*" + s.substring(i+1);
        }
      }

      int counter = vowels.size()-1;
      for(int j=0; j<s.length(); j++){
        if(s.charAt(j) == '*' && counter >= 0){
          s = s.substring(0, j) + vowels.get(counter) + s.substring(j+1);
          counter--;
        }
      }
      return s;
    }
}
