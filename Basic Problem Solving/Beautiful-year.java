/*
 * Problem Name: Beautiful Year
 * Platform: Codeforces
 * Problem Number: 271A
 * Difficulty: 800
 * Problem Link:
 * https://codeforces.com/contest/271/problem/A
 */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		while(true)
		{
		    y++;
		    int d=y;
		    int a=d%10;
		    d=d/10;
		    int b=d%10;
		    d=d/10;
		    int c=d%10;
		    d=d/10;
		    if(a!=b && b!=c && c!=d && d!=a && c!=a && b!=d )
		    {
		        System.out.println(y);
		        break;
		    }
		}
	}
}