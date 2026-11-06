/*
 * Problem Name: Count Distinct in Array
 * Platform: GeeksforGeeks
 * Problem Number: Not specified
 * Difficulty: Basic
 * Problem Link:
 * https://www.geeksforgeeks.org/problems/find-distinct-elements--130928/0
 */
class Solution {
    public int countDistinct(int arr[]) {
       HashMap<Integer,Integer>ma=new HashMap<>();
       for(int i=0;i<arr.length;i++)
       {
           ma.put(arr[i],1);
       }
       return ma.size();
    }
}