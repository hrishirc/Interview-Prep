package problems;

/**
 * SOURCE : https://leetcode.com/problems/unique-paths/
 */
public class UniquePaths
{

	// TODO : @Prashant and @Mohit, please add your solutions here

	/*
		BY : Hrishikesh
		RUNNING TIME : O(n)
		DESCRIPTION :  You always go n-1 steps to n's side, m-1 steps on m's side.
		Ultimately problem is nothing but how many combinations can you have i.e. n+m-2 C n-1
		e.g. if n = 2, m = 3 => solution can be NMM or MNM or MMN.
		Think of it like you like theatre hall row has 20 seats. You have a group of 10 people. What are the ways in which these 10 people can sit.
 	*/
	public static int HrcUniquePaths(int m,
			int n)
	{
		int s = Math.min(m, n);

		if (s == 1)
			return 1;

		int max = m + n - 2;
		long num = max, den = 1;
		for (int i = 2; i <= s - 1; i++)
		{
			num *= max - i + 1;
			den = den * i;
		}

		return (int) (num / den);
	}
} /*end of UniquePaths.java*/