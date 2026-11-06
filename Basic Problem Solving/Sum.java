/*
 * Problem Name: Sum
 * Platform: Codeforces
 * Problem Number: 1742A
 * Difficulty: 800
 * Problem Link:
 * https://codeforces.com/contest/1742/problem/A
 */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0; i<n; i++)
	    {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        if((a+b==c)||(b+c==a)||(c+a==b))
	        {
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
	}
}