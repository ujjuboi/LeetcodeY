import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      EqualRowAndColumnPairs er = new EqualRowAndColumnPairs();
      int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
      System.out.println(er.equalPairs(grid));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private int equalPairs(int[][] grid) {
    Map<Integer, int[]> columns = new HashMap<>();
    for(int i=0; i<grid.length; i++){
        int[] col = new int[grid.length];
        for(int j=0; j<grid.length; j++){
            col[j] = grid[j][i];
        }
        columns.put(i, col);
    }
    int count = 0;
    for(int i=0; i<grid.length; i++){
        for(int[] j: columns.values()){
            if(Arrays.equals(grid[i], j)){
                count++;
            }
        }
    }
    // System.out.println(columns);
    return count;
  }
}
