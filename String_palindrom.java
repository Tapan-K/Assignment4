package in.ineuron.string;
import java.util.*;

public class String_palindrom {

	public static void main(String[] args) {
		
		String input , reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string / Number to check palindrom ?");
	    input = sc.next();
	    int length = input.length();
	    for(int i=length-1;i>=0;i--)
	    	reverse = reverse + input.charAt(i);
	    if(input.equals(reverse))
	    	System.out.println("The given string / number is palindrom");
	    else 
	    	System.out.println("The given string / number is not palindrom");
	    

	}

}
