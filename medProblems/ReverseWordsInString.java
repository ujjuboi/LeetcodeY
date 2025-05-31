package medProblems;

public class ReverseWordsInString{
  public static void main (String args[]){
    final long startTime = System.nanoTime();
    // Do something
    ReverseWordsInString rw = new ReverseWordsInString();
    System.out.println(rw.reverseWords("a good   example"));
    final long endTime = System.nanoTime();
    System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  private String reverseWords(String s) {
    s = s.trim();
    String[] sentence = s.split(" ");
    String newSentence = sentence[sentence.length - 1];
    for(int i=sentence.length-2; i>=0; i--){
      if(sentence[i].isEmpty()){
        continue;
      }
      newSentence = newSentence.substring(0, newSentence.length()) + " " + sentence[i].trim();
    }
    newSentence = newSentence.trim();
    return newSentence;
  }
}