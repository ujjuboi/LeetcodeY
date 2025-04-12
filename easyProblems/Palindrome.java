package easyProblems;
//https://leetcode.com/problems/palindrome-number/

public class Palindrome {
    public static void main(String[] args){
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(121));
    }   

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String palindrome = "";
        for (int i=s.length()-1; i>=0; i--){
            palindrome += s.charAt(i);
        }
        if(palindrome.equals(s)){
            return true;
        } else {
            return false;
        }
    }
}
