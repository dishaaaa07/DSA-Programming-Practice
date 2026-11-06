/*
 * Problem Name: Reverse String
 * Platform: LeetCode
 * Problem Number: 344
 * Difficulty: Easy
 * Problem Link:
 * https://leetcode.com/problems/reverse-string/
 */
class Solution {
    public void reverseString(char[] s) {
       Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length;i++)
       {
        st.push(s[i]);
       }
       for(int i=0;i<s.length;i++)
       {
        s[i]=st.pop();
       }
       System.out.println(s);
    }
}