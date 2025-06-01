public class StringCompression {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      StringCompression sc = new StringCompression();
      char[] chars = {'a','a','b','b','c','c','c'};
      System.out.println(sc.compress(chars));
      final long endTime = System.nanoTime();
      // System.out.println('Total execution time: 0.' + (endTime - startTime) + ' ms');
  }
  private int compress(char[] chars) {
    if(chars.length == 1){
      return 1;
    }
    String s = "" + chars[0];
    // //function one with simple compression of chars:
    // for(int i=1; i<chars.length; i++){
    //     if(chars[i-1] == chars[i]){
    //         continue;
    //     } else {
    //         s = s.append(chars[i]);
    //     }
    // }
    // int charInS = 0;
    // System.out.println(s);
    //function two for adding counts to compression:
    //Need to use substring for this:
    int count = 1;
    for(int i=1; i<chars.length; i++){
      if(chars[i-1] == chars[i]){
        count++;
      } else {
        if(count == 1){
          s += chars[i];
        } else {
          s += count;
          s += chars[i];
          count = 1;
        }
      }
      if(i == chars.length-1){
        if(count > 1){
          s += count;
        }
      }
    }
    chars = s.toCharArray();
    return chars.length;
  }
}
