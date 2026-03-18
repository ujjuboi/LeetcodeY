import java.util.Arrays;

public class ValidAnagram {

  public static void main(String[] args) {
    ValidAnagram va = new ValidAnagram();
    String s = "aacc", t = "ccac";
    System.out.println(va.isAnagram(s, t));
  }

  public boolean isAnagram(String s, String t) {
    char[] sChar = s.toCharArray();
    char[] tChar = t.toCharArray();
    Arrays.sort(sChar);
    Arrays.sort(tChar);
    System.out.println(sChar);
    System.out.println(tChar);
    return Arrays.equals(sChar, tChar);
  }
}
