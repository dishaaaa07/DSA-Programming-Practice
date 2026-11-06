/*
 * Problem Name: Second Largest
 * Platform: GeeksforGeeks
 * Problem Number: Not specified
 * Difficulty: Easy
 * Problem Link:
 * https://www.geeksforgeeks.org/problems/second-largest3735/0
 */
class Solution {
    public int getSecondLargest(int[] arr) {
        int l=-1;
        int sl=-1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>l)
            {
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl && arr[i]!=l)
            {
                sl=arr[i];
            }
        }
        return sl;
    }
}