/* Program name: First Bad version

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

Example:

Given n = 5, and version = 4 is the first bad version.

call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true

Then 4 is the first bad version.*/
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
//to find out the solution of this question I am using simple binary search. 
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i=1;
        int j=n;
        
        while(i<j){
             int mid=i+(j-i)/2;// It is fair enough to write down int mid=(i+j)/2. But as if your test cases is large enough there is a chance to integer overflow. 
           if(isBadVersion(mid)){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return i;
        
    }
}
