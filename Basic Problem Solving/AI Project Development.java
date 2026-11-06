/*
 * Problem Name: AI Project Development
 * Platform: Codeforces
 * Problem Number: 2233A
 * Difficulty: 800
 * Problem Link:
 * https://codeforces.com/contest/2233/problem/A
 */
 
import java.util.*;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int op1 = (int)Math.ceil((double)n / (x + y));

            int op2;

            if(n <= x * z)
            {
                op2 = (int)Math.ceil((double)n / x);
            }
            else
            {
                int rl = n - x * z;

                op2 = z + (int)Math.ceil((double)rl / (x + 10 * y));
            }

            System.out.println(Math.min(op1, op2));
        }

        sc.close();
    }
}
