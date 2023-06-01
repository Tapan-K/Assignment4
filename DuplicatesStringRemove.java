package in.ineuron.string;

import java.util.Arrays;

public class DuplicatesStringRemove {
  static void removeDuplicates(char[] str, int length) {
	  int index = 0;
	  boolean[] visited = new boolean[256];
	  
	  for(int i=0;i<length;i++) {
		  char current = str[i];
		  if(!visited[current]) {
			  visited[current]=true;
			  str[index++]=current;
		  }
	  }
	  System.out.println("The Resulting string with duplicates removed are "+ String.valueOf(Arrays.copyOf(str, index)));
  }

    public static void main(String[] args) {
        String info = "abbccdd";
        char[] str = info.toCharArray();
        int len = str.length;
        removeDuplicates(str,len);
    }
}
