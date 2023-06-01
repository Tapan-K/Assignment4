package in.ineuron.string;

import java.util.*;

public class MaxOccuringChar {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to find the maximum occurring character: ");
		str = sc.next();
		
		char[] string = str.toCharArray();
		int[] freq = new int[string.length];
		
		for(int i = 0; i < string.length; i++) {
			freq[i] = 1;
			for(int j = i+1; j < string.length; j++) {
				if(string[i] == string[j] && string[i] != ' ') {
					freq[i]++;
				}
			}
		}
		
		int max = freq[0];
		char maxChar = string[0];
		for(int i = 0; i < freq.length; i++) {
			if(freq[i] > max) {
				max = freq[i];
				maxChar = string[i];
			}
		}
		
		System.out.println("The maximum occurring character in the given string is: " + maxChar+ " with "+max+" times repeatation.");
	}
}
