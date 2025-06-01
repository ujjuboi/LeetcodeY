package easyProblems;

public class IsSubsequence {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      IsSubsequence is = new IsSubsequence();
      System.out.println(is.isSubsequence("abc", "ahbgdc"));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private boolean isSubsequence(String s, String t) {
    if(s.length() == t.length() && s.equals(t)){
      return true;
    } else if(s.length() == 0){
      return true;
    }
    boolean state = false;
    int i = 0, j = 0;
    while(i<s.length() && j<t.length()){
      if(s.charAt(i) == t.charAt(j)){
        state = true;
      } else {
        state = false;
      }
      if(state){
        i++;
      } 
      j++;
    }
    if(i == s.length()){
      return true;
    } else {
      return false;
    }
  }
}
