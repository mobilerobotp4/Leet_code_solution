/*
Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the 
right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

Example 1:
Input: 
nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation: 
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.
Example 2:
Input: 
nums = [1, 2, 3]
Output: -1
Explanation: 
There is no index that satisfies the conditions in the problem statement.
*/

import java.util.Arrays;

public class Q724 {
    public static void main(String args[]){
        int [] arr={1, 7, 3, 6, 5, 6};
        Solution724 obj724=new Solution724();
        System.out.println(obj724.pivotIndex(arr));

    }
}
class Solution724{
    public int pivotIndex(int[] nums) {
        int pivot_index=-1;
        int sum=0,sum1=0, k=0,k1=0;
        boolean found=false;
        int j1=(nums.length-1);
        int [] left_sum=new int [nums.length];
        int [] right_sum = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            left_sum[i]=sum;
        }
        for(int j=nums.length-1;j>=0;j--){
            sum1=sum1+nums[j];
            right_sum[k]=sum1;
            k++;
        }
        while(k1<left_sum.length && j1>=0){
            if(left_sum[k1]==right_sum[j1]&&!found){
                pivot_index=k1;
                found=true;
            }
            k1++;
            j1--;
        }
        System.out.println(Arrays.toString(right_sum));
        System.out.println(Arrays.toString(left_sum));

        return pivot_index;

    }
}
