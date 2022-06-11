package LeetCode.AllTopic;

/*
Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).



Example 1:
Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".

Example 2:
Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".

Example 3:
Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
 */

public class RegularExpressionMatching {
    class Solution {
        public boolean isMatch(String s, String p) {
            int rows = s.length();
            int columns = p.length();
            /// Base conditions
            if (rows == 0 && columns == 0) {
                return true;
            }
            if (columns == 0) {
                return false;
            }
            // DP array
            boolean[][] dp = new boolean[rows + 1][columns + 1];
            // Empty string and empty pattern are a match
            dp[0][0] = true;
            // Deals with patterns with *
            for (int i = 2; i < columns + 1; i++) {
                if (p.charAt(i - 1) == '*') {
                    dp[0][i] = dp[0][i - 2];
                }
            }

            for (int i = 1; i < rows + 1; i++) {
                for (int j = 1; j < columns + 1; j++) {
                    if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else if (j > 1 && p.charAt(j - 1) == '*') {
                        dp[i][j] = dp[i][j - 2];
                        if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                            dp[i][j] = dp[i][j] | dp[i - 1][j];
                        }
                    }
                }
            }
            return dp[rows][columns];
        }
    }
}
