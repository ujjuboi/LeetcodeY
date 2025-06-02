public class ContainWithMostWater {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      ContainWithMostWater cw = new ContainWithMostWater();
      int[] height = {1,2,1};
      System.out.println(cw.maxArea(height));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private int maxArea(int[] height) {
      int left = 0;
        int right = height.length-1;
        int min = height[left];
        if(min > height[right]){
            min = height[right];
        }
        int area = (right-left) * min;
        for(int i=0; i<height.length; i++){
            if(height[left] > height[right]){
                min = height[right];
                if(area < (right-left) * min){
                    area = (right-left) * min;
                }
                right--;
            } else {
                min = height[left];
                if(area < (right-left) * min){
                    area = (right-left) * min;
                }
                left++;
            }
        }
        return area;
    }
}
