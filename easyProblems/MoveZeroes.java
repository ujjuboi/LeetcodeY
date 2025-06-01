package easyProblems;

public class MoveZeroes {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      MoveZeroes mz = new MoveZeroes();
      int[] nums = {0,1,0,3,12};
      mz.moveZeroes(nums);
      for(int i:nums){
        System.out.print(i + " ");
      }
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private void moveZeroes(int[] nums) {
    int counterIndex = 0;
      for(int i=0; i<nums.length; i++){
        if(nums[i] != 0){
          nums[counterIndex] = nums[i];
          counterIndex++;
        } 
      }
      for(int j=counterIndex; j<nums.length; j++){
        nums[j] = 0;
      }
  }
}
