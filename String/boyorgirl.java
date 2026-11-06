/*
 * Problem Name:  Boy or Girl
 * Platform: Codeforces
 * Problem Number: 236A
 * Difficulty: 800
 * Problem Link:
 * https://codeforces.com/contest/236/problem/A
 */

import java.util.*;
public class BoyOrGirl
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        int l=s.length();
        int c=0;
        for(int i=0;i<l;i++)
        {
            boolean f=false;
            for(int j=0;j<i;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    f=true;
                    break;
                }
            }
            if(!f)
            {
                c++;
            }
        }
        if(c%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}