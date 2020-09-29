/*
Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences.

Note:

The same word in the dictionary may be reused multiple times in the segmentation.
You may assume the dictionary does not contain duplicate words.
Example 1:

Input:
s = "catsanddog"
wordDict = ["cat", "cats", "and", "sand", "dog"]
Output:
[
  "cats and dog",
  "cat sand dog"
]
Example 2:

Input:
s = "pineapplepenapple"
wordDict = ["apple", "pen", "applepen", "pine", "pineapple"]
Output:
[
  "pine apple pen apple",
  "pineapple pen apple",
  "pine applepen apple"
]
Explanation: Note that you are allowed to reuse a dictionary word.
*/

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<String, List<String>> memo = new HashMap<>();
        if (memo.containsKey(s)) return memo.get(s);
        
        List<String> res = new ArrayList<>();
        
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                if (s.length() == word.length())
                    res.add(word);
                else {
                    List<String> sub = wordBreak(s.substring(word.length()), wordDict);
                    for (String w : sub)
                        res.add(word + " " + w);
                }
            }
        }
        
        memo.put(s, res);
        return memo.get(s);
        
    }
}
