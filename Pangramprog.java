package in.ineuron.string;

public class Pangramprog {

	public static void main(String[] args) {
		String s1 = "The quick brown fox jumps over the lazy dog";
		s1=s1.toLowerCase();
		s1=s1.replace(" ", "");
		char[] ch=s1.toCharArray();
		
		int[] arr = new int[26];
		for(int i=0;i<ch.length;i++) {
			int index=ch[i]-'a';
			arr[index]++;
		}
		
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				flag=false;
				break;
			} 
				
			
		}
		
		if(flag)
			System.out.println("This string is pangram...");
		else
			System.out.println("This is not pangram.");
		
		
	

	}

}
