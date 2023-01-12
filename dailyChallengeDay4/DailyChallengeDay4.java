package dailyChallengeDay4;
/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space. 

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1*/

public class DailyChallengeDay4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {4,1,2,1,2};
		//int [] nums= {1};
		//int [] nums= {2,2,1};
		int uniqueNum=nums[0];
		for (int i = 1; i < nums.length; i++) {
			uniqueNum=uniqueNum^nums[i];
		}
		System.out.println("Unique Number is "+uniqueNum);
		

	}

}
