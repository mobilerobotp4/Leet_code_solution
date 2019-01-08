/*Input: S = "abcd", indexes = [0,2], sources = ["a","cd"], targets = ["eee","ffff"]
        Output: "eeebffff"
        Explanation: "a" starts at index 0 in S, so it's replaced by "eee".
        "cd" starts at index 2 in S, so it's replaced by "ffff".*/
package Leetcode;

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
