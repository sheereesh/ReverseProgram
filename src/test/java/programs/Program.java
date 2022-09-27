package programs;

public class Program {
	public static void main(String[] args) {
		String s="sheereesh";
		 String rev="";
		//int len=s.length();
		//for( int i=len-1;i>=0;i--) {
			//rev=rev+s.charAt(i);
		//}
		//System.out.println(rev);
		 
		//  char a[]=s.toCharArray();
		  //int len =s.length();
		 // for(int i=a.length-1;i>=0;i--)
		  //{
			//  rev=rev+a[i];
		  //}
		 //System.out.println(rev);
		// char ch[]=s.toCharArray();
		 //for(int i=ch.length-1;i>=0;i--) {
			// rev=rev+ch[i];
	 //}
		// System.out.println(rev);
	//}
	
	StringBuffer obj=new StringBuffer(s);
	 
	System.out.println(obj.reverse());
	}
	 
}
