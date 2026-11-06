/*
 * Problem Name: Fizz Buzz
 * Platform: LeetCode
 * Problem Number: 412
 * Difficulty: Easy
 * Problem Link:
 * https://leetcode.com/problems/fizz-buzz/
 */
class Solution {
    public List<String> fizzBuzz(int n) {
        String[] arr=new String[n];
        for(int i=1;i<=n;i++)
        { 
            int arrInd=i-1;
            if(i%3==0 && i%5==0)
            {
                arr[arrInd]="FizzBuzz";
            }
            else if(i%3==0)
            {
                arr[arrInd]="Fizz";
            }
            else if(i%5==0)
            {
                arr[arrInd]="Buzz";
            }
            else
            {
                arr[arrInd]=Integer.toString(i);
            }
        }
        return Arrays.asList(arr);
    }
}
