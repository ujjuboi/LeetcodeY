public class ZigZigConversion {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something'
      ZigZigConversion zz = new ZigZigConversion();
      System.out.println(zz.convert("PAYPALISHIRING", 4));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private String convert(String s, int numRows) {
        String ans = "";
        int offset = numRows-1;
        for(int i=0; i<numRows; i++){
            int j = i;
            while(j < s.length()){
                ans += s.charAt(j);
                j += Math.abs(offset-i) * 2;
                System.out.println(j);
            }
        }
        return ans;
    }
}
