/* Leetcode: QuestionNo:204
Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
*/
/*Method Explanation:
Suppose that we have established one prime number as the fact (e.g. value 2 is a trivial prime).
Then we can rule out all its multiples from the list. After that, we could pick up the next remaining number (which would be number 3), 
conclude that it is prime simply because it was not removed in previous step, and then remove all its successors. Since value 4 has been
ruled out by prime number 2, next candidate to expand would be 5. By continuing this process we will remove all multiples of all prime 
numbers. Numbers that remain will be the prime numbers that we wanted to find.

This algorithm is known as the Sieve of Eratosthenes, after ancient Greek mathematician Eratosthenes of Cyrene. 

Asymptotic complexity of the algorithm is O(N loglogN).

*/

//Solution

class Solution {
    public int countPrimes(int n) {
        
      boolean[] notPrime = new boolean[n];//create an array of length n of boolean type which by default store values false. if n=2 then the array looklike ={false,false}
        int counter = 0;
        for (int i = 2; i < n; i++){
            if (!notPrime[i]) {
                counter++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        return counter;
        
    }
}
