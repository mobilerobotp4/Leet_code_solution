/*66. Plus One

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array
contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Question No:66
*/


import java.util.Arrays;

public class Q60 {
    public static void main(String args[]){
        int [] arr={9};
        SolutionQ60 obj60=new SolutionQ60();
        System.out.println(Arrays.toString(obj60.plusOne(arr)));
    }
}
class SolutionQ60{
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0){
            return new int[0];
        }

        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
               digits[i]= digits[i]+1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;

    }
}
