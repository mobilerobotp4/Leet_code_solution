/*
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    ...
Example 1:

Input: 1
Output: "A"
Example 2:

Input: 28
Output: "AB"
Example 3:

Input: 701
Output: "ZY"
*/

class Solution {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
		char[] chars = new char[] { ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
				'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		while (n > 26) {

			if (n % 26 == 0) {
				res.insert(0, 'Z');
				n = n - 26;
			} else {

				res.insert(0, chars[n % 26]);

			}
			n = n / 26;

		}
		res.insert(0, chars[n]);
		return res.toString(); 
        
    }
}
