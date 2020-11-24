/*
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.

 

Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false

*/

class Solution {
    public boolean isPowerOfFour(int n) {
        return (Math.log10(n) / Math.log10(4)) % 1 == 0;
        
    }
}

//Runtime: 1 ms, Memory Usage: 35.7 MB
