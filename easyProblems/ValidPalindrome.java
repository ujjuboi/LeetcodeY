public class ValidPalindrome {
  public static void main(String[] args) {
    ValidPalindrome vp = new ValidPalindrome();
    String s = "A man, a plan, a canal: Panama";
    System.out.println(vp.isPalindrome(s));
  }

  public boolean isPalindrome(String s){
    s = s.toLowerCase();
    String plainString = "";
    for(char i : s.toCharArray()){
      if((97 <= i && i <= 122) || (48 <= i && i <= 57)){
        plainString += i;
      } else {
        continue;
      }
    }
    StringBuilder palindrome = new StringBuilder(plainString);
    palindrome.reverse();
    String seePalindrome = palindrome.toString();
    if(seePalindrome.equals(plainString)){
      return true;
    }
    return false;
  }
}
