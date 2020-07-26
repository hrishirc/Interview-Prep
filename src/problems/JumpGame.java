package problems;

/**
 * SOURCE : https://leetcode.com/problems/jump-game/
 */
public class JumpGame
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[]{2,3,1,1,4};
		int[] arr2 = new int[]{3,2,1,0,4};

		System.out.println(HrcCanJump(arr1));
		System.out.println(HrcCanJump(arr2));
	}

	// TODO : @Prashant and @Mohit, please add your solutions here

	/*
		BY : Hrishikesh
		RUNNING TIME : O(n)
		DESCRIPTION : update maximum coverable distance while passing through each index
	 */
	public static boolean HrcCanJump(int[] nums)
	{
		int maxTraversableIdx = 0;

		int len = nums.length;

		for (int i = 0; i <= maxTraversableIdx && i < len; i++)
		{
			maxTraversableIdx = Math.max(nums[i] + i, maxTraversableIdx);

			if (maxTraversableIdx >= (len - 1))
			{
				return true;
			}
		}

		return maxTraversableIdx >= (len - 1);
	}

} /*end of JumpGame.java*/ 