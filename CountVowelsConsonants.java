package in.ineuron.string;
import java.util.*;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		int vCount=0,cCount=0,sCount=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check no.of vowels ,consonants and special character ?");
        String s1 =sc.next();
        s1=s1.toLowerCase();
        
        for(int i=0;i<s1.length();i++) {
        	if((s1.charAt(i)=='a')||(s1.charAt(i)=='e')||(s1.charAt(i)=='i')||(s1.charAt(i)=='o')||(s1.charAt(i)=='u')) {
        		vCount++;
        	}else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
        		cCount++;
        	else
        		sCount++;
        }
        System.out.println("The vowels present in string are "+vCount);
        System.out.println("The consonants present in string are "+cCount);
        System.out.println("The special characters present in string are "+sCount);
        	
	}

}
