package easyProblems;

public class FindPivotIndex {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      FindPivotIndex fp = new FindPivotIndex();
      int[] nums = {1,7,3,6,5,6};
      System.out.println(fp.pivotIndex(nums));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private int pivotIndex(int[] nums) {
        int[] leftSumArray = new int[nums.length];
        int[] rightSumArray = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        if(nums.length == 1){
            return 0;
        }
        while(left < nums.length && right > 0){
            leftSumArray[left+1] = nums[left] + leftSumArray[left];
            rightSumArray[right-1] = nums[right] + rightSumArray[right];
            left++;
            right--;
        }
        for(int i=0; i<nums.length; i++){
            if(leftSumArray[i] == rightSumArray[i]){
                return i;
            }
        }
        return -1;
    }
}
