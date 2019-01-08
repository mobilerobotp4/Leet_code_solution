/*
Problem Name: Power of two

Given an integer, write a function to determine if it is a power of two.

Example 1:

Input: 1
Output: true
Explanation: 20 = 1
Example 2:

Input: 16
Output: true
Explanation: 24 = 16
Example 3:

Input: 218
Output: false
 */


public class Q231 {
    public static void main(String args[]){
        Solution231 obj231=new Solution231();
        System.out.println(obj231.isPowerOfTwo(32));

    }
}
class Solution231{
    public boolean isPowerOfTwo(int n) {

        if(n<1)
            return false;
        while(n>2)
        {
            if(n%2!=0) {
                return false;

            }
            n = n / 2;
        }
        return true;

    }
}
