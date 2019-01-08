/*
Problem Name: Find And Replace in String

Problem Statements: To some string S, we will perform some replacement operations that replace groups of letters with new ones 
(not necessarily the same size).

Each replacement operation has 3 parameters: a starting index i, a source word x and a target word y.  The rule is that if x starts at 
position i in the original string S, then we will replace that occurrence of x with y.  If not, we do nothing.

For example, if we have S = "abcd" and we have some replacement operation i = 2, x = "cd", y = "ffff", then because "cd" starts at 
position 2 in the original string S, we will replace it with "ffff".

Using another example on S = "abcd", if we have both the replacement operation i = 0, x = "ab", y = "eee", as well as another replacement
operation i = 2, x = "ec", y = "ffff", this second operation does nothing because in the original string S[2] = 'c', which doesn't match
x[0] = 'e'.

All these operations occur simultaneously.  It's guaranteed that there won't be any overlap in replacement: for example, S = "abc", 
indexes = [0, 1], sources = ["ab","bc"] is not a valid test case.

Input: S = "abcd", indexes = [0,2], sources = ["a","cd"], targets = ["eee","ffff"]
        Output: "eeebffff"
        Explanation: "a" starts at index 0 in S, so it's replaced by "eee".
        "cd" starts at index 2 in S, so it's replaced by "ffff".*/


import java.util.Arrays;

public class Q833 {
    public static void main(String args[]){
        String S="abcd";
        int[] indexes  = {0, 2};
        String[]sources={"ab","ec"};
        String[] targets = {"eee", "ffff"};
        Solve833 ob833=new Solve833();
        System.out.println(ob833.findReplaceString(S,indexes,sources,targets));
    }
}
class Solve833{
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        StringBuilder sb=new StringBuilder(S);
        int[] offsets=new int[indexes.length];

        for(int i=0;i<indexes.length;i++){

            if(S.substring(indexes[i],indexes[i]+sources[i].length()).equals(sources[i])){
                int offset=0;
                for(int j=0;j<i;j++){
                    if(indexes[j]<indexes[i])
                        offset+=offsets[j];
                }
                sb.replace(indexes[i]+offset,indexes[i]+sources[i].length()+offset,targets[i]);
                offsets[i]=targets[i].length()-sources[i].length();

            }
        }

        return sb.toString();
    }
}
