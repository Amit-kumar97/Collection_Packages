package LeetCode.NewUser;

import java.util.HashMap;
import java.util.Scanner;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed from
magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine)
    {
        HashMap<Character, Integer> count = new HashMap();

        for(char c:magazine.toCharArray())
        {
            count.put(c, count.getOrDefault(c,0)+1);
        }
        for(char c: ransomNote.toCharArray())
        {
            if(!count.containsKey(c) || count.get(c) <= 0)
                return false;
            count.put(c, count.get(c)-1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter magazine String:");
        String magazine = sc.next();
        System.out.println("Enter RansomNote String:");
        String ransomNote = sc.next();

        System.out.println(canConstruct(ransomNote, magazine));
    }
}
