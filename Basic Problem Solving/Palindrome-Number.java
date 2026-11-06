/*
 * Problem Name: Palindrome Number
 * Platforms:
 * 1. LeetCode - Problem 9
 * 2. GeeksforGeeks - Palindrome Number
 * Difficulty:
 * LeetCode: Easy
 * GeeksforGeeks: Easy
 * Problem Links:
 * LeetCode: https://leetcode.com/problems/palindrome-number/description/
 * GFG: https://www.geeksforgeeks.org/problems/palindrome0746/1
 */
class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int r=0;
        if(x<0)
        {
            return false;
        }
        while(x>0)
        {
            int d=x%10;
            x=x/10;
            r=(r*10)+d;
        }
        if(r==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}