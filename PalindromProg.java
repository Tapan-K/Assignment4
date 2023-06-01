package in.ineuron.string;
import java.util.*;

public class PalindromProg {

	public static void main(String[] args) {
		String s1;
		String s2 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check palindrom or not ? ");
		s1 = sc.next();
		int length = s1.length();
		for(int i=length-1;i>=0;i--)
			s2 =s2+s1.charAt(i);
		if(s1.equals(s2))
			System.out.println("This is palindrom");
		else
			System.out.println("This is not palindrom..");

	}

}
