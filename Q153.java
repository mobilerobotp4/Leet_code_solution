/*Find Minimum in Rotated Sorted Array
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

Find the minimum element.

You may assume no duplicate exists in the array.

Example 1:

Input: [3,4,5,1,2]
Output: 1
Example 2:

Input: [4,5,6,7,0,1,2]
Output: 0
 */


import java.util.Arrays;

public class Q153 {
    public static void main(String args[]){
        int[]arr={3,4,5,1,2};
        Solution153 obj153=new Solution153();
        System.out.println(obj153.findMin(arr));

    }
}
class Solution153{
    public int findMin(int[] nums) {
        int min=nums[0];
       for(int i=0;i<nums.length-1;i++){
           if(nums[i+1]<nums[i]){
               min=nums[i+1];
               break;
           }
       }

        return min;

    }
}
