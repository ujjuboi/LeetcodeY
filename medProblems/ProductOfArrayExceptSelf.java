package medProblems;

public class ProductOfArrayExceptSelf {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      ProductOfArrayExceptSelf po = new ProductOfArrayExceptSelf();
      int[] nums = {1,2,3,4};
      int[] answer = po.productExceptSelf(nums);
      for(int i: answer){
        System.out.print(i + " ");
      }
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private int[] productExceptSelf(int[] nums) {
    int[] answer = new int[nums.length];
    int[] prefix = new int[nums.length];
    int[] postfix = new int[nums.length];
      for(int i=0; i<nums.length; i++){
        //doing for pre first:
        int pre = 1;
        if(i != 0){
          pre = prefix[i-1];
        } 
        prefix[i] = nums[i] * pre;
      }
      for(int i=nums.length-1; i>=0; i--){
        //doing for post next:
        int post = 1;
        if(i != nums.length-1){
          post = postfix[i+1];
        }
        postfix[i] = nums[i] * post;
      }
      for(int i=0; i<answer.length; i++){
        if(i == 0){
          answer[i] = 1 * postfix[i+1];
        } else if(i == answer.length-1){
          answer[i] = 1 * prefix[i-1];
        } else {
          answer[i] = prefix[i-1] * postfix[i+1];
        }
      }
      return answer;
  }
}
