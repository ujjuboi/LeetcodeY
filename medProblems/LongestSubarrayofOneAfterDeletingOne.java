public class LongestSubarrayofOneAfterDeletingOne {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      LongestSubarrayofOneAfterDeletingOne ls = new LongestSubarrayofOneAfterDeletingOne();
      int[] nums = {0,1,1,1,0,1,1,0,1};
      System.out.println(ls.longestSubarray(nums));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private int longestSubarray(int[] nums) {
    int left = 0;
    int right = 0;
    int zeroCount = 0;
    int oneCount = 0;
    int actualCount = 0;
    for(int i=0 ; i<nums.length; i++){
      if(nums[i] == 0){
        zeroCount++;
      }
    }
    if(zeroCount <= 1){
      return nums.length-1;
    } else {
      for(int i=0; i<nums.length; i++){
        left = i;
        right = i;
        zeroCount = 0;
        oneCount = 0;
        while(zeroCount <= 1 && right<nums.length){
          if(nums[right] == 0){
            zeroCount++;
          } else {
            oneCount++;
          }
          right++;
        }
        if(oneCount > actualCount){
          actualCount = oneCount;
        }
      }
    }
    return actualCount;
  }
}
