package easyProblems;

public class MergeStringAlternate{
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        // Do something
        MergeStringAlternate m = new MergeStringAlternate();
        System.out.println(m.mergeAlternately("abcxd", "p"));
        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
    }
    
    private String mergeAlternately(String word1, String word2) {
        String merged = "";
        for(int i=0; i<word1.length(); i++){
            merged += word1.charAt(i);
            if(i >= word2.length()){
                continue;
            } else {
                merged += word2.charAt(i);
            }
        }
        if(merged.length() != word1.length() + word2.length()){
            merged += word2.substring(word1.length(), word2.length());
        }
        return merged;
    }
}