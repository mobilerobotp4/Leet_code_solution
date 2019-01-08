package Leetcode;

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
