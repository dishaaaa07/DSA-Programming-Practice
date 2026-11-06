/*
 * Problem Name: Petya and Strings
 * Platform: Codeforces
 * Problem Number: 112A
 * Difficulty: 800
 * Problem Link:
 * https://codeforces.com/contest/112/problem/A
 */
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String st1=sc.next().toLowerCase();
        String st2=sc.next().toLowerCase();
        int s=st1.compareTo(st2);
        
        if(s==0)
        {
            System.out.println("0");
        }
        else if(s>0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("-1");
        }
        
    }
}
