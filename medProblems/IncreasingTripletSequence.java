//Cheated with this: https://www.youtube.com/watch?v=90tYQ5jNVPo
//bruh

public class IncreasingTripletSequence {
  public static void main (String args[]){
    final long startTime = System.nanoTime();
    // Do something
    IncreasingTripletSequence it = new IncreasingTripletSequence();
    int[] num = {4,5,2147483647,1,2};
    System.out.println(it.increasingTriplet(num));
    final long endTime = System.nanoTime();
    System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private boolean increasingTriplet(int[] nums) {
    int left = Integer.MAX_VALUE;
    int mid = Integer.MAX_VALUE;
    for(int i=0; i<nums.length; i++){
      if(nums[i] > mid) {
        return true;
      } else if(nums[i]>left && nums[i]<mid){
        mid = nums[i];
      } else if(nums[i]<left){
        left = nums[i];
      }
    }
    return false;
  }
}
