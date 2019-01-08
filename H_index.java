/*
H-Index: Defination: The h-index is an author-level metric that attempts to measure both the productivity and citation impact of the 
publications of a scientist or scholar. The index is based on the set of the scientist's most cited papers and the numberof citations that 
they have received in other publications.

How to calculate H-index: Formally, if f is the function that corresponds to the number of citations for each publication, we compute the h index as follows. First we order the values of f from the largest to the lowest value. Then, we look for the last position in which f is greater than or equal to the position (we call h this position). For example, if we have a researcher with 5 publications A, B, C, D, and E with 10, 8, 5, 4, and 3 citations, respectively, the h index is equal to 4 because the 4th publication has 4 citations and the 5th has only 3. In contrast, if the same publications have 25, 8, 5, 3, and 3, then the index is 3 because the fourth paper has only 3 citations.

f(A)=10, f(B)=8, f(C)=5, f(D)=4, f(E)=3　→ h-index=4
f(A)=25, f(B)=8, f(C)=5, f(D)=3, f(E)=3　→ h-index=3

If we have the function f ordered in decreasing order from the largest value to the lowest one, we can compute the h index as follows:

h-index (f) = ${\displaystyle \max _{i}\min(f(i),i)} \max _{i}\min(f(i),i)$

Problem Statement: Given an array of citations (each citation is a non-negative integer) of a researcher, write a function to compute 
the researcher's h-index.

Example: Input: citations = [3,0,6,1,5]
Output: 3 
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had 
             received 3, 0, 6, 1, 5 citations respectively. 
             Since the researcher has 3 papers with at least 3 citations each and the remaining 
             two with no more than 3 citations each, her h-index is 3.

*/

import java.util.Arrays;

public class H_index {
    public static void main(String args[]){
        int[]citations={25,11,8,75,101,40};
        cal abc= new cal();
        System.out.println(abc.H_ret(citations));


    }
}
 class cal{
   public int H_ret(int []a){
       Arrays.sort(a);
       int H_val=0;
       for(int i=0; i<a.length; i++){
           int smaller = Math.min(a[i], a.length-i);
           H_val = Math.max(H_val, smaller);
       }

       return H_val;
}

}
