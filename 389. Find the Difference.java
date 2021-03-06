/**
Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.

Example:

Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.
Solution Analysis:
Runtime: 1 ms, faster than 98.85% of Java online submissions for Find the Difference.
Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Find the Difference.
**/

class Solution {
    public char findTheDifference(String s, String t) {
		int charSum =0;
		for(int i =0;i<s.length();i++){
			charSum -= (int)s.charAt(i);
			charSum += (int)t.charAt(i);
		}
		charSum += (int)t.charAt(t.length()-1);
		return (char)charSum;
	}

}