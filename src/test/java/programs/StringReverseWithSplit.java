package programs;

public class StringReverseWithSplit {

	public static void main(String[] args) {
		 String str= "krishna mohan";
		 String[] words = str.split(" ");
		 String revString="";
		 //split will divide from where space are availble and rerun and array if u put a (str.split("a")).then it will divide the string into an array
		//str.length()  is predefined method of string class,
		 // which returns the number of characters in the string
		 //words.length is predefined variable,
		 // which returns the size of an array
		 System.out.println(str.length());
		 System.out.println(words.length);
		 for(int i=0;i<words.length;i++)
		 {
			String word=words[i];
			 //System.out.println(word);
			 String revWords="";
			 
			 for(int j=word.length()-1;j>=0;j--) 
			 {
				 //charAt return the character of an index j
				 revWords=revWords+word.charAt(j);
				 
			 }
			 
			 revString=revString+revWords+" ";
		  }
		 System.out.println(revString);
 }

}
