/*
Given two strings, determine if they share a common substring. A substring may be as small as one character.

For example, the words "a", "and", "art" share the common substring . The words "be" and "cat" do not share a substring.

Function Description

Complete the function twoStrings in the editor below. It should return a string, either YES or NO based on whether the strings share a common substring.

twoStrings has the following parameter(s):

s1, s2: two strings to analyze .
Input Format

The first line contains a single integer , the number of test cases.

The following  pairs of lines are as follows:

The first line contains string .
The second line contains string .
Constraints

 and  consist of characters in the range ascii[a-z].
Output Format

For each pair of strings, return YES or NO.

Sample Input

2
hello
world
hi
world
Sample Output

YES
NO
*/
package dictionaries_hashmaps;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoString {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		
		for(int i=0; i<q; i++){
			
			Set<Character> s1 = toCharSet(sc.next());
			Set<Character> s2 = toCharSet(sc.next());
			
			s1.retainAll(s2);
			
			if(s1.size() > 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		
	}
	
	
	
	public static Set<Character> toCharSet(String words) {
	
		Set<Character> charSet = new HashSet<Character>();
		
		for(int i=0; i< words.length(); i++ ) {
			charSet.add(words.charAt(i));
		}
		
		return charSet;
	}
	
	
}

































