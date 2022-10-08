package programs;

public class Practice11 {

	public static void main(String[] args) {
		int arr[]= {5,5,4,4,3,3,2,2,1,1};
	String  str=(String) arr.toString();
	 String[] words=str.split("");
	 
		 System.out.println(words);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
		if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			
			System.out.println(arr[i]);
		}

	}

}
