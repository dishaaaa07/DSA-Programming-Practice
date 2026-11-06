/*
 * Problem Name: Plus One
 * Platform: LeetCode
 * Problem Number: 66
 * Difficulty: Easy
 * Problem Link:
 * https://leetcode.com/problems/plus-one/
 */
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--)
         {
            if (digits[i] < 9) 
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}