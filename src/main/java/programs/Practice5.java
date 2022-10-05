package programs;

import java.util.HashMap;
import java.util.Map;

public class Practice5 {

	public static void main(String[] args) {
		 String str="krishna mohan ";
		char []ch=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(char cha:ch) {
			if (!map.containsKey(cha)) {
				map.put(cha , 1);
				
			}
				else {
					int value=map.get(cha);
					map.put(cha, value+1);
				}
					
			
		}
		System.out.println(map);
	}

}
