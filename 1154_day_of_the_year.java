/*
Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

 

Example 1:

Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:

Input: date = "2019-02-10"
Output: 41

*/

class Solution {
    public int dayOfYear(String date) {
        String[] arr = date.split("-");
        int ans=0;
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<Integer.parseInt(arr[1])-1;i++){
            ans+= month[i];
        }
        if(     leap(Integer.parseInt(arr[0])) && Integer.parseInt(arr[1]) > 2       ) ans++;
        ans+= Integer.parseInt(arr[2]);
        return ans;
    }
    public boolean leap(int i){
        return (i%4==0 && i%100 !=0 )|| (i %400==0);
        
    }
}
