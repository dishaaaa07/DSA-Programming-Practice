/*
 * Problem Name: Remove Duplicates from Sorted Array
 * Platform: LeetCode
 * Problem Number: 26
 * Difficulty: Easy
 * Problem Link:
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
           if(nums[i]!=nums[j])
           {
            i++;
            nums[i]=nums[j];
           }
        }
        return i+1;
    }
}