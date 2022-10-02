package programs;

public class OccurenceOfEachCharacterInAString {

	public static void main(String[] args) {
	String str="kRishna mohan";
	String lowerCase=str.toLowerCase();
	char[] ch=lowerCase.toCharArray();
	for(int i=0;i<lowerCase.length();i++) {
		for(int j=i+1;j<lowerCase.length();j++) {
			if(ch[i]==ch[j]) {
				System.out.println("duplicate item are :"+ch[j]);
			}
		}
	}
	}
	
	
	
}
