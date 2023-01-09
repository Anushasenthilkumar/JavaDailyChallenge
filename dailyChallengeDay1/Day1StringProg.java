package dailyChallengeDay1;

//Given a string s consisting of words and spaces, return the length of the last word in the string.
//
//A word is a maximal substring consisting of non-space characters only.
//
// 
//
//Example 1:
//
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.

public class Day1StringProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="   fly me   to   the moon  ";
		str=str.trim();
		String[] strArray=str.split(" ");
		String lastWord=strArray[strArray.length-1];
		System.out.println("The last word is "+lastWord+"with the length "+lastWord.length());
		
				

	}

}
