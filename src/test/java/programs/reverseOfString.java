package programs;

public class reverseOfString{
public static void main(String[] args) {
	String str="mphasis technologies";
	String rev="";
	//to charArray will convert string into  string into array
	char a[]=str.toCharArray();
	for(int i=a.length-1;i>=0;i--) {
		rev=rev+a[i];
		
	}
	System.out.println(rev);
}
}
