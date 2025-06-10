import java.util.Stack;

public class RemovingStarsFromString {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      RemovingStarsFromString rs = new RemovingStarsFromString();
      System.out.println(rs.removeStars("leet**cod*e"));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private String removeStars(String s) {
        Stack<Character> removedString = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == '*'){
                removedString.pop(); 
            } else {
                removedString.push(ch);
            }
        }
        // for(int i=0; i<s.length(); i++){
        //     if(s.charAt(i) == '*'){
        //         removedString.pop();
        //     } else {
        //         removedString.push(s.charAt(i));
        //     }
        // }
        StringBuilder outputString = new StringBuilder();
        for(char i : removedString){
            outputString.append(i);
        }
        return outputString.toString();
    }
}
