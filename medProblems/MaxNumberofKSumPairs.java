//I cheated on this, didnt understand why we need to compare to sum everytime
import java.util.Arrays;

public class MaxNumberofKSumPairs {
  public static void main (String args[]){
    final long startTime = System.nanoTime();
    // Do something
    MaxNumberofKSumPairs mn = new MaxNumberofKSumPairs();
    int[] nums = {3,1,3,4,3};
    int k = 6;
    System.out.println(mn.maxOperations(nums, k));
    final long endTime = System.nanoTime();
    System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private int maxOperations(int[] nums, int k) {
    int left = 0;
    int right = nums.length-1;
    int ops = 0;
    Arrays.sort(nums);
    while(right > left){
      int sum = nums[right] + nums[left];
        if(sum == k){
          ops++;
          right--;
          left++;
        } else if(sum > k) {
          right--;
        } else {
          left++;
        }
    }
    return ops;
  }
}
