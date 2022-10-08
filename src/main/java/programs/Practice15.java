package programs;

public class Practice15 {




	public static void main(String[] args) {
		int arr[]= {1,2,2,3,4,5,77,77,77,99,99};


		for(int i=0;i<arr.length;i++) {
			int	count=1;
			for(int j=i+1;j<arr.length;j++) {


				if(arr[i]==arr[j]) {
					count++; 
				}	
				else 
					break;



			}			 
			System.out.println("duplicate elelments are "+arr[i]+"occurance is "+count);				 

			i+=count-1;

		}


	}

}


