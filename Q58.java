/*Leetcode - Problem:58: Length of Last Word

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5

*/
//Solution:

class Solution {
   public int lengthOfLastWord(String s) {

        s = s.trim();     //trim()- eliminates leading and trailing spaces.
        if (s.isEmpty()){
            return 0;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == ' ') {
                return s.length() - i - 1;//it get ' ' when i = 5 for above mentioned problem. Length of string =11. So ,11-5-1=5. There 
                }                         //is a need of -1 in (return s.length() - i - 1) because indexing starting from 0.
        }
        return s.length();//The case where there no space in between the word. Like a single word say, Hello which is the first as well as
    }                     //last word of given string so return 5.

}
