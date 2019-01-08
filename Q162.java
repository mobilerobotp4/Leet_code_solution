/* Find Peak Element
A peak element is an element that is greater than its neighbors.

Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 1 or 5
Explanation: Your function can return either index number 1 where the peak element is 2,
             or index number 5 where the peak element is 6.
 */
package Leetcode;

public class Q162 {
    public static void main(String ars[]){
        //int [] arr={1,2,1,3,5,6,4};
       // int [] arr={2,1};
        int[] arr={1,2,3,1};
        Solution162 obj162=new Solution162();
        System.out.println(obj162.findPeakElement(arr));

    }
}
class Solution162{
    public int findPeakElement(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;

    }
}
