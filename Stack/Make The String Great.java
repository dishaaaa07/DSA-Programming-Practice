/*
 * Problem Name: Make The String Great
 * Platform: LeetCode
 * Problem Number: 1544
 * Difficulty: Easy
 * Problem Link:
 * https://leetcode.com/problems/make-the-string-great/
 */
class Solution
{
    public String makeGood(String s) 
    {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i<s.length(); i++) 
        {
            char ch = s.charAt(i);
            if (!st.isEmpty() && Math.abs(st.peek()-ch) == 32) 
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        StringBuilder result=new StringBuilder();
        while (!st.isEmpty()) 
        {
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}
