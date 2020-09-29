
/*
Leetcode: 868

Given a positive integer N, find and return the longest distance between two consecutive 1's in the binary representation of N.

If there aren't two consecutive 1's, return 0.

 

Example 1:

Input: 22
Output: 2
Explanation: 
22 in binary is 0b10110.
In the binary representation of 22, there are three ones, and two consecutive pairs of 1's.
The first consecutive pair of 1's have distance 2.
The second consecutive pair of 1's have distance 1.
The answer is the largest of these two distances, which is 2.
*/

class Solution {
    public int binaryGap(int N) {
        int count = 0;
        int distance = 0;
        while (N > 0) {
            int remainder = N % 2;
            if (remainder == 1 ) {
                if (count != 0) {
                    if (distance < count) {
                        distance = count;
                    }
                    count = 0;
                    N *= 2;
                } 
            else {
                    count++;
                }
            }
            if (remainder == 0) {
                if (count != 0) {
                    count++;
                }
            }
            N /= 2;
        }
        return distance;
        
    }
}
