package in.ineuron.string;
import java.util.*;

public class UniqueCharacter {
	static boolean uniqueChar(String str) {
		for(int i=0;i<str.length();i++)
			for(int j=i+1;j<str.length();j++)
				if(str.charAt(i)==str.charAt(j))
					return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check unique character contained or not ?");
		String input = sc.next();
		
		if(uniqueChar(input)) 
			System.out.println("The String " + input + " contains unique characters.");
		else
			System.out.println("The String " + input + " does not contain unique characters.");
		

	}

}
