package easyProblems;

import java.util.ArrayList;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {
  public static void main (String args[]){
      final long startTime = System.nanoTime();
      // Do something
      FindTheDifferenceOfTwoArrays fd = new FindTheDifferenceOfTwoArrays();
      int[] nums1 = {1,2,3};
      int[] nums2 = {2,4,6};
      System.out.print(fd.findDifference(nums1,nums2));
      final long endTime = System.nanoTime();
      System.out.println("Total execution time: 0." + (endTime - startTime) + " ms");
  }
  
  private List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        boolean present = false;
        
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    present = true;
                    break;
                } 
            }
            if(present){
              present = false;
                continue;
            } else {
              if(list1.contains(nums1[i])){
                continue;
              } else {
                list1.add(nums1[i]);
              }
            }
        }
        
        for(int i=0; i<nums2.length; i++){
            for(int j=0; j<nums1.length; j++){
                if(nums2[i] == nums1[j]){
                    present = true;
                    break;
                } 
            }
            if(present){
                present = false;
                continue;
            } else {
                if(list2.contains(nums2[i])){
                continue;
              } else {
                list2.add(nums2[i]);
              }
            }
        }
        System.out.println(list1);
        System.out.println(list2);

        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(list1);
        listOfList.add(list2);
        return listOfList;
    }
}
