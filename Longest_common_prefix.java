/* Problem 14 - Longest common prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
*/

//Solution:

class Solution {
    public String longestCommonPrefix(String[] strs) {
         if(strs.length==0) {
             return "";
         }
    String minStr=strs[0];

    for(int i=1;i<strs.length;i++){
        if(strs[i].length()<minStr.length())
            minStr=strs[i];//find out the word which have minimum length
    }
    int end=minStr.length();
    for(int i=0;i<strs.length;i++){
        int j;
  //compare each word's each letter with the minimum length word's each letter.        
        for( j=0;j<end;j++){
            if(minStr.charAt(j)!=strs[i].charAt(j))
                break;
        }
        if(j<end)
            end=j;
    }
    //return the minimum length that make a match with the smallest word
    return minStr.substring(0,end);
        
    }
}
