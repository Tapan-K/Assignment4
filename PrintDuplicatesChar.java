package in.ineuron.string;

public class PrintDuplicatesChar {

	public static void main(String[] args) {
		String s1 = "abcabc";
		char[] str=s1.toCharArray();
		int count;
		System.out.println("the removed string are :");
		for(int i= 0;i<str.length;i++) {
			count=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j] && str[i]!=' ') {
					count++;
					str[j]='0';
				}
			}
			
			if(count>1 && str[i]!='0') {
				System.out.println(str[i]);
			}
		}
		

	}

}
