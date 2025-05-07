package easyProblems;
//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public static void main(String[] args){
        LongestCommonPrefix p = new LongestCommonPrefix();
        String[] strs = {"aaa","aa","aaa"};
        System.out.println(p.longestCommonPrefix(strs));
    }

    private String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length == 1){
            return strs[0];
        }
        for (int i=0; i<strs.length-1; i++){
            String firstString = "";
            if(i == 0){
                firstString = strs[i];
            } else {
                firstString = prefix;
                prefix = "";
            }
            String secondString = strs[i+1];
            for(int j=0; j<firstString.length();){
                for(int k=0; k<secondString.length(); k++){
                    if(j+1>firstString.length()){
                        break;
                    } else if (firstString.charAt(j) == secondString.charAt(k)){
                        prefix += firstString.charAt(j);
                    } else {
                        break;
                    }
                    j++;
                }
                break;
            }
            if(prefix.equals("")){
                return prefix;
            }
        }
        return prefix;
    }
}
