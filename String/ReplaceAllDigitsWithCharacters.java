/*
 * Problem Name: Replace All Digits with Characters
 * Platform: LeetCode
 * Problem Number: 1844
 * Difficulty: Easy
 * Problem Link:
 * https://leetcode.com/problems/replace-all-digits-with-characters/
 */
class Solution {
    public String replaceDigits(String s) 
    {
        String st="";
        for (int i=0;i<s.length();i++) {
            if (i%2==0) 
            {
                st=st+s.charAt(i);
            }
            else
            {
                char ch=(char)(s.charAt(i - 1)+(s.charAt(i)-'0'));
                st=st+ch;
            }
        }
        return st;
    }
}