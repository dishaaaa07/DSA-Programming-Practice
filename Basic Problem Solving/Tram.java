/*
 * Problem Name: Tram
 * Platform: Codeforces
 * Problem Number: 116A
 * Difficulty: 800
 * Problem Link:
 * https://codeforces.com/contest/116/problem/A
 */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int d=0;
		for(int i=0;i<n;i++)
		{
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        c=(c-a)+b;
		        if(c>d)
		        {
		            d=c;
		        }
		}
	
		System.out.println(d);
	}
}