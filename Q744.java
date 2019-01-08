/*
Given a list of sorted characters letters containing only lowercase letters, and given a target letter target,
find the smallest element in the list that is larger than the given target.

Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.

Examples:
Input:
letters = ["c", "f", "j"]
target = "a"
Output: "c"

Input:
letters = ["c", "f", "j"]
target = "c"
Output: "f"

Input:
letters = ["c", "f", "j"]
target = "d"
Output: "f"

Input:
letters = ["c", "f", "j"]
target = "g"
Output: "j"

Input:
letters = ["c", "f", "j"]
target = "j"
Output: "c"

Input:
letters = ["c", "f", "j"]
target = "k"
Output: "c"
 */
package Leetcode;

public class Q744 {
    public static void main(String args[]){
        //Test case 1:
        /*char[]letters={'c', 'f', 'j'};
        char target= 'a';*/
        //Test case 2:
        char[]letters={'c', 'f', 'j'};
        char target= 'g';
        /*Test case 3:
        char[]letters={'c', 'f', 'j'};
        char target= 'j';*/
        /*char[]letters={'c', 'f', 'j'};
        char target= 'k';*/
        Solution744 obj744=new Solution744();
        System.out.println(obj744.nextGreatestLetter(letters,target));

    }
}
class Solution744{
    public char nextGreatestLetter(char[] letters, char target) {
       // char a=' ';
        for(int i=0;i<=letters.length-1;i++) {

            if (letters[i] > target) {

                return letters[i];

            }
        }
            return letters[0];
      /*  for (char c: letters){
            System.out.println(c);
            if (c > target) return c;

        }

        return letters[0];*/
    }

}
