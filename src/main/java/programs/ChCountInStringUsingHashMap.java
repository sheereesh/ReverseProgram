package programs;

import java.util.HashMap;
import java.util.Map;

public class ChCountInStringUsingHashMap {

	
	public static void main(String[] args) {
		String str="hello";
		char [] charac=str.toCharArray();
		 Map<Character,Integer> map=new HashMap<>();
		 for(char ch:charac) {
			 if(!map.containsKey(ch)) {
				 map.put(ch,1);
				 }
			 else {
				 int value=map.get(ch);
				 map.put(ch,value+1 );
			 }
		 }
	
	System.out.println(map);
	
	}
	
	
	
}
