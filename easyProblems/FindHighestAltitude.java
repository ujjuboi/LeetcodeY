package easyProblems;

public class FindHighestAltitude {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      FindHighestAltitude fh = new FindHighestAltitude();
      int[] gain = {-4,-3,-2,-1,4,3,2};
      System.out.println(fh.largestAltitude(gain));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private int largestAltitude(int[] gain) {
    // int[] distanceTravelled = new int[gain.length+1];
    // distanceTravelled[0] = 0;
    int sumTravelled = 0;
    int maxSumTravelled = 0;
    for(int i=0; i<gain.length; i++){
      sumTravelled += gain[i];
      if(sumTravelled > maxSumTravelled){
        maxSumTravelled = sumTravelled;
      }
    }
    return maxSumTravelled;
  }
}
