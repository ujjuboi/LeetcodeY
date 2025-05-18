package easyProblems;
//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public static void main (String args[]){
        final long startTime = System.nanoTime();
        // Do something
        args = new String[]{"acc","aaa","aaba"};
        LongestCommonPrefix l = new LongestCommonPrefix();
        System.out.println("The longest common prefix among the words is: " + l.longestCommonPrefix(args));
        final long endTime = System.nanoTime();
        System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
    }
    private String longestCommonPrefix(String strs[]){
        String prefix = strs[0];
        if(strs.length == 1){
            return strs[0];
        }
        // Compare first two words to get the prefix:
        int limit = 0;
        for(int i=0; i<strs.length-1; i++){

            if(strs[i].length() > strs[i+1].length()){
                limit = strs[i+1].length();
            } else {
                limit = strs[i].length();
            }

            for(int j=0; j<limit; j++){
                if(prefix.charAt(j) == strs[i+1].charAt(j)){
                    prefix += strs[i].charAt(j);
                } else {
                    limit = j;
                    break;
                }
            }
            prefix = prefix.substring(0, limit);
            if(prefix.equals("")){
                return prefix;
            }
        }
        return prefix;
    }
}
