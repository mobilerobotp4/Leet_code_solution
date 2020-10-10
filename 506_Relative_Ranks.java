/*
Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
Note:
N is a positive integer and won't exceed 10,000.
All the scores of athletes are guaranteed to be unique.
*/

class Solution {
    public String[] findRelativeRanks(int[] nums) {
        Integer[] temp = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        
        Arrays.sort(temp, Collections.reverseOrder());
        
        Map<Integer,Integer> sortedPosition = new HashMap<>();
        for(int i =0; i <temp.length; i++) {
            sortedPosition.put(temp[i], i);
        }
        
        String[] result = new String[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            int finalPos = sortedPosition.get(nums[i]) + 1;
            if(finalPos == 1) result[i] = "Gold Medal";
            else if(finalPos == 2) result[i] = "Silver Medal";
            else if(finalPos == 3) result[i] = "Bronze Medal";
            else result[i] = finalPos + "";
        }
        
        return result;
        
    }
}
