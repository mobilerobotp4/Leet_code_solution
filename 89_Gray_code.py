'''
The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

Example 1:

Input: 2
Output: [0,1,3,2]
Explanation:
00 - 0
01 - 1
11 - 3
10 - 2

For a given n, a gray code sequence may not be uniquely defined.
For example, [0,2,3,1] is also a valid gray code sequence.

00 - 0
10 - 2
11 - 3
01 - 1

Pattern:
if n = 0: 0 -- 0

if n = 1: 0 -- 0, 1 -- 1

if n = 2: 00 -- 0, 01 -- 1, 11 -- 3, 10 -- 2

if n = 3: 000 -- 0, 001 -- 1, 011 -- 3, 010 -- 2, 110 -- 6, 111 -- 7, 101 -- 5, 100 -- 4.

f(n) = [0, f(n-1)] + [1, reverse(f(n-1))]
'''

class Solution(object):
    def grayCode(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        return self.grayCode(n-1) + [2**(n-1) + x for x in reversed(self.grayCode(n-1))] if n else [0]
      
