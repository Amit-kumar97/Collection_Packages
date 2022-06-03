package LeetCode.AllTopic;

/*
3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class Longest_SubString {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            String ans = "";

            int maxLength = -1;

            if (s.isEmpty()) {
                return 0;
            }
            else if (s.length() == 1) {
                return 1;
            }
            for (char c : s.toCharArray()) {
                String current = String.valueOf(c);

                if (ans.contains(current)) {
                    ans = ans.substring(ans.indexOf(current)
                            + 1);
                }
                ans = ans + String.valueOf(c);
                maxLength = Math.max(ans.length(), maxLength);
            }

            return maxLength;
        }
    }
}
