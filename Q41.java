package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q41 {
     public static void main(String args[]){
        // int[]numer={2,1,0};
         //int[]numer={3,4,-1,1};
         int[]numer={ 7,8,9,11,12};
         Solution41 obj41=new Solution41();
         System.out.println(obj41.firstMissingPositive(numer));

     }
}
class Solution41{
    public int firstMissingPositive(int[] nums) {
        Map<Integer,Boolean> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],true);
            System.out.println(map.get(i));
        }
        System.out.println(map);
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