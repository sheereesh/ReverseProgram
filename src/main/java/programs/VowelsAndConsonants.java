package programs;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		 String str="KRISHNA MOHAN   ";
		 int vowels=0;
		 int consonants=0;
		 String  lowerStr=str.toLowerCase();
		 for(int i=0;i<lowerStr.length();i++) {
			 char ch=lowerStr.charAt(i);
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				 vowels++;
			 }
			 else if ((ch >= 'a' && ch <= 'z')) {
				 
				 
				 
				 System.out.println( ch);  
			        ++consonants;
			      }
		 }
		 System.out.println("vowels  "+vowels+"  consonants"+ consonants);  
		 
	}
	
}
