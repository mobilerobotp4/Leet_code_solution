/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.

*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
         if(s.length()!=t.length()){
         return false;
    }
 
    HashMap<Character, Character> map1 = new HashMap<>();
    HashMap<Character, Character> map2 = new HashMap<>();
 
    for(int i=0; i<s.length(); i++){
        char c1 = s.charAt(i);
        char c2 = t.charAt(i);
 
        if(map1.containsKey(c1)){
            if(c2!=map1.get(c1)){
                return false;
            }
        }else{
            if(map2.containsKey(c2)){
                return false;
            }
 
            map1.put(c1, c2);
            map2.put(c2, c1);
        }
    }
 
    return true;
        
    }
}

// 2nd Solution (Space Efficient)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
           return false; 
        } 
        int[] arr1 =  new int[128];
        int[] arr2 = new int[128];
        for(int i=0; i<s.length(); i++){
            if(arr1[s.charAt(i)]!= arr2[t.charAt(i)]){
                return false;
            }
            arr1[s.charAt(i)]= i+1;
            arr2[t.charAt(i)]=i+1;
                
        }
        return true;
        
    }
}
