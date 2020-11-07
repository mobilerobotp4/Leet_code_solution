/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"
Example 2:

Input: "leetcode"
Output: "leotcede"
Note:
The vowels does not include the letter "y".
*/
//Solution:

class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
    if(s == null || n == 0)
        return "";
    char[] str = s.toCharArray();
    
    int i = 0;
    int j = n-1;

    Set<Character>set = new HashSet<>();
    set.add('a');
    set.add('e');
    set.add('i');
    set.add('o');
    set.add('u');
    set.add('A');
    set.add('E');
    set.add('I');
    set.add('O');
    set.add('U');
    
    while(i<j){
        while(i<j && !set.contains(str[i]))
            i++;
         while(i<j && !set.contains(str[j]))
             j--;
       
        if(set.contains(str[i]) && set.contains(str[j])){
            char t = str[i];
            str[i] = str[j];
            str[j] = t;
            i++;
            j--;               
        }
        
    }
    return new String(str);
        
    }
}
