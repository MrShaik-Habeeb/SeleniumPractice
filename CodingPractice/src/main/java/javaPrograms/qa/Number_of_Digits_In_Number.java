package javaPrograms.qa;



public class Number_of_Digits_In_Number {

	public static void main(String[] args) {

		int num = 96;
		int count = 0;
		
		while(num>0)
		{
			num = num/10;
			count++;
			
		}
		System.out.println("Number of digits : "+count);

	}

}
