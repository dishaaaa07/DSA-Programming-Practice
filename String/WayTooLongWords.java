/*
 * Problem Name: Way Too Long Words
 * Platform: Codeforces
 * Problem Number: 71A
 * Difficulty: 800
 * Problem Link:
 * https://codeforces.com/contest/71/problem/A
 */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) 
        {
            String s = sc.next();
            if (s.length() > 10) 
            {
                System.out.println(s.charAt(0)+String.valueOf(s.length() - 2)+s.charAt(s.length() - 1));
            }
            else
            {
                System.out.println(s);
            }
        }
    }
}
