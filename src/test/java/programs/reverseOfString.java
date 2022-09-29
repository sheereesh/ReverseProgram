package programs;

public class reverseOfString{
public static void main(String[] args) {
	String str="krishna mohan";
String a[]=str.split("");
	
	String rev="";      
	 
	 
	 for(int i=a.length-1;i>=0;i--) {
		 
		rev=rev+a[i];
	 
	}
	System.out.println(rev);
}
}
