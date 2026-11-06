/*
 * Problem Name: Vanya and Fence
 * Platform: Codeforces
 * Problem Number: 677A
 * Difficulty: 800
 * Problem Link:
 * https://codeforces.com/contest/677/problem/A
 */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int x=sc.nextInt();
	    int[] arr=new int[n];
	    int s=0;
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	        if(arr[i]<=x)
	        {
	            s=s+1;
	        }
	        else{
	            s=s+2;
	        }
	    }
	    System.out.println(s);
	}
}