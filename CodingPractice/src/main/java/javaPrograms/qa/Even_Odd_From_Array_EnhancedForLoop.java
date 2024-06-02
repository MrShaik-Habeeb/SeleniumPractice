package javaPrograms.qa;


public class Even_Odd_From_Array_EnhancedForLoop {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6};
		
		System.out.println("Even Numbers In Array");
		
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
		System.out.println("Odd Numbers in Array");
		
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}
	}

}