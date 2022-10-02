package programs;

public class Pracrice4 {





	public static void main(String[] args) {
		String str="KRISHNA MOHAN 1234 9";
		int vowels=0;
		int consonants=0;
		int digits =0;
		int spaces=0;
		String  lowerStr=str.toLowerCase();
		for(int i=0;i<lowerStr.length();i++) {
			char ch=lowerStr.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}
			else if (ch>='a' && ch <='z')

			{
				consonants++;	 
			}

			else if (ch>='0'&&ch<='9') {
				digits++; 
			}
			else if (ch>=' ')
			{
				spaces++;
			}
		}

		System.out.println("vowels  "+vowels+"  consonants"    +consonants+"  digits  "+digits +"  spaces  "+spaces);  



	}

}


