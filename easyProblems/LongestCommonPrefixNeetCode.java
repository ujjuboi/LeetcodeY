package easyProblems;

public class LongestCommonPrefixNeetCode {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        // Do something
        LongestCommonPrefixNeetCode l = new LongestCommonPrefixNeetCode();
        System.out.println("The longest common prefix among the strings provided is " + l.longestCommonPrefix(args));
        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
    }
    private String longestCommonPrefix(String strs[]){
        String prefix = "";
        for(int i=0; i<strs[0].length(); i++){
            for(String s: strs){
                if(i == s.length()){
                    return prefix;
                } else if(s.charAt(i) != strs[0].charAt(i)){
                    return prefix;
                }
            }
            prefix += strs[0].charAt(i);
        }
        return prefix;
    }
}
