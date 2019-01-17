
/*
Given an unsorted integer array, find the smallest missing positive integer.

Example 1:

Input: [1,2,0]
Output: 3
Example 2:

Input: [3,4,-1,1]
Output: 2
Example 3:

Input: [7,8,9,11,12]
Output: 1
*/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q41 {
     public static void main(String args[]){
        // int[]numer={2,1,0}; Test Case:1
         //int[]numer={3,4,-1,1}; Test Case:2
         int[]numer={ 7,8,9,11,12}; //Test Case:3
         Solution41 obj41=new Solution41();
         System.out.println(obj41.firstMissingPositive(numer));

     }
}
class Solution41{
    public int firstMissingPositive(int[] nums) {
        Map<Integer,Boolean> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],true);
            
        }
        
        int result=1;
        while(result<=Integer.MAX_VALUE){
            if(map.containsKey(result)){
                System.out.println(map.containsKey(result));
                result++;
            }
            else{
                return result;
            }

        }
        return result;
    }
}
