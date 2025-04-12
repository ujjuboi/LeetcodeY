package easyProblems;
//https://leetcode.com/problems/two-sum/

import java.util.Arrays;

class TwoSum {
    public static void main(String[] args){
        TwoSum t = new TwoSum();
        int[] nums = new int[] {-18,12,3,0};
        System.out.println(Arrays.toString(t.twoSum(nums, -6)));
    }

    public int[] twoSum(int[] nums, int target) {
        int firstInd, secondInd;
        firstInd = secondInd = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum = nums[j] + nums[i];
                if(sum == target){
                    firstInd = i;
                    secondInd = j;
                    return new int[] {firstInd, secondInd};
                } else {
                    continue;
                }
            }
        }
        return new int[] {firstInd, secondInd};
    }
}