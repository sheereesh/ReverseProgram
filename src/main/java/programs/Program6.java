package programs;

 
import java.util.HashMap;
import java.util.Map;

public class Program6 {

	public static void main(String[] args) {
		  String str="krishna mohan sheereesh mohan krishna ramesh";
		 String[] words=str.split(" ");
 Map<String,Integer> map=new HashMap<String,Integer>();
 for(String word:words) {
	 if(!map.containsKey(word)) {
		map.put(word, 1);
	 }
	 else
	 {
		int value=map.get(word);
		map.put(word, value+1);
	 }
 }
System.out.println(map);
	}

}
