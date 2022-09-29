package programs;

public class EachWordOfAString {

	public static void main(String[] args) {
		String str="krishna mohan";
	String	rev="";
		char []words=str.toCharArray();
		System.out.println( str.length());
		for(int i= words.length-1;i>=0;i--) {
			rev=rev+words[i];
		}
 System.out.println(rev);
	}

}
