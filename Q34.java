/*Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 */

import java.util.Arrays;

public class Q34 {
    public static void main(String args[]){
        int []arr={5,7,7,8,8,8,10}; //Input Array
        int t=8; //Target Values
    Solution34 obj34=new Solution34();
    System.out.println(Arrays.toString(obj34.searchRange(arr,t)));
    }
}
class Solution34{
    public int[] searchRange(int[] nums, int target) {
       
        int[]index={-1,-1};// Intialize with {-1,-1} because if the target is not present in the given array it returned (-1,-1)
        int old_end_index=-1;
        boolean found_startindex=false;
        int[]a=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(!found_startindex){
                    index[0]=i; // When 1st target index found
                    found_startindex=true;
                }
                old_end_index=i;

            }
        }
        index[1]=old_end_index; //Assign last target index
      
      return index;
    }
}
