package easyProblems;

public class MaxAverageSubArray {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      MaxAverageSubArray ma = new MaxAverageSubArray();
      int[] nums = {1,12,-5,-6,50,3};
      int k = 4;
      System.out.println(ma.findMaxAverage(nums, k));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private double findMaxAverage(int[] nums, int k) {
    int left = 0;
    int right = k;
    int maxSum = 0;
    for (int i=left; i<right; i++){
      maxSum += nums[i];
    }
    int sum = maxSum;
    while(right < nums.length){
      sum -= nums[left];
      left++;
      sum += nums[right];
      right++;
      maxSum = Math.max(maxSum, sum);
    }
    return (double) maxSum/k;
  }
}
