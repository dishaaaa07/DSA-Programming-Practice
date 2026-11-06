/*
 * Problem Name: Holiday Of Equality
 * Platform: Codeforces
 * Problem Number: 758A
 * Difficulty: 800
 * Problem Link:
 * https://codeforces.com/contest/758/problem/A
 */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    int max=0;
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	        if(arr[i]>max)
	        {
	            max=arr[i];
	        }
	    }
	    int s=0;
	    for(int j=0;j<n;j++)
	    {
	        if(arr[j]<max)
	        {
	            s=s+(max-arr[j]);
	        }
	    }
	    System.out.println(s);
	}
}