public class MaxNumVowelsInSubGivenLength {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      MaxNumVowelsInSubGivenLength mv = new MaxNumVowelsInSubGivenLength();
      System.out.println(mv.maxVowels("leetcode", 3));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private int maxVowels(String s, int k) {
        int left = 0;
        int right = k;
        String vowels = "aeiou";
        int maxVowelsSum = 0;
        for(int i=0; i<k; i++){
            if(vowels.contains(String.valueOf(s.charAt(i)))){
                maxVowelsSum++;
            }
        }
        int vowelsCount = maxVowelsSum;
        while(right < s.length()){
            if(vowels.contains(String.valueOf(s.charAt(left)))){
                vowelsCount--;
                
            } 
            if(vowels.contains(String.valueOf(s.charAt(right)))){
                vowelsCount++;
            }
            left++;
            right++;
            if(vowelsCount > maxVowelsSum){
                maxVowelsSum = vowelsCount;
            }
        }

        return maxVowelsSum;
    }
}
