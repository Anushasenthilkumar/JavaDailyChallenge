package dailyChallengeDay3;
/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.*/

public class DailyChallengeDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		String onlyAlphaString="";
		String reverseAlphaString="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isAlphabetic(c)) {			
				onlyAlphaString+=Character.toLowerCase(c);
			}
		}
		
		for (int i = onlyAlphaString.length() -1; i >=0; i--) {
			reverseAlphaString+=onlyAlphaString.charAt(i);			
		}
		if(onlyAlphaString.equals(reverseAlphaString)||onlyAlphaString.equals(""))
			System.out.println("true");
		else
			System.out.println("false");
		

	}

}
