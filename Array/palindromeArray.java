/*
 * Problem Name: Palindrome Array
 * Platform: GeeksforGeeks
 * Problem Number: Not specified
 * Difficulty: Basic
 * Problem Link:
 * https://www.geeksforgeeks.org/problems/perfect-arrays4645/0
 */
class Solution {
    public static boolean isPalindrome(int[] arr) {
        int n=arr.length;
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr[n-1-i])
            {
                f=1;
                break;
            }
        }
        if (f==0)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
