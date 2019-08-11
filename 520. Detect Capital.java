/**
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
 

Example 1:

Input: "USA"
Output: True
 

Example 2:

Input: "FlaG"
Output: False
Runtime: 1 ms, faster than 100.00% of Java online submissions for Detect Capital.
Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Detect Capital.

**/

class Solution {
    public boolean detectCapitalUse(String word) {
      int count =0;
        for(int i =0;i<word.length();i++){
            if(word.charAt(i) >= 65 && word.charAt(i)<=90)
                count ++;
        }
        if(count == word.length() || count == 0 || (count == 1 && (word.charAt(0)>=65 && word.charAt(0)<=90)))
           return true;
    return false;
    }
}