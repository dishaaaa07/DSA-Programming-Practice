/*
 * Problem Name: Baseball Game
 * Platform: LeetCode
 * Problem Number: 682
 * Difficulty: Easy
 * Problem Link:
 * https://leetcode.com/problems/baseball-game/
 */
import java.util.*;
class Solution {
    public int calPoints(String[] operations) 
    {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < operations.length; i++)
        {
            if(operations[i].equals("+"))
            {
                int t = st.pop();
                int n = t + st.peek();
                st.push(t);
                st.push(n);
            }
            else if(operations[i].equals("D"))
            {
                st.push(2 * st.peek());
            }
            else if(operations[i].equals("C"))
            {
                st.pop();
            }
            else
            {
                String d = operations[i];
                st.push(Integer.parseInt(d));
            }
        }
        int s = 0;
        int k = st.size();
        for(int j = 0; j < k; j++)
        {
            s = s + st.pop();
        }
        return s;
    }
}
