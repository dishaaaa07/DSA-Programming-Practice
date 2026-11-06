/*
 * Problem Name: Max Consecutive Ones
 * Platform: LeetCode
 * Problem Number: 485
 * Difficulty: Easy
 * Problem Link:
 * https://leetcode.com/problems/max-consecutive-ones/
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int f=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                c++;  
            }
            
            else
            {
              c=0;
            }
            if(c>f)
                {
                   f=c;
                }
        }
        return f;
        
    }
}