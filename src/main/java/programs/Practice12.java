package programs;

public class Practice12 {

	public static void main(String[] args) {
		 String s="krishna mohan";
		 String s1=new String("krishna mohan");
		 String s2=new String("krishna mohan");
		 String s3=new String("krishna mohan");
		 String s4=new String("krishna mohan");
		 String s5="krishna mohan";
		 System.out.println(s2==s4);
		 System.out.println(s.equals(s5)); 
		 String s6="krishna mohan";
		 System.out.println(s.hashCode());
		 System.out.println(s6.hashCode());
		 System.out.println(s1.hashCode());
		 System.out.println(s2.hashCode());
	}

}
