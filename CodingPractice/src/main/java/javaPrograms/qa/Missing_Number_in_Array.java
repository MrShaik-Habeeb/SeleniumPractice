package javaPrograms.qa;



public class Missing_Number_in_Array {

	public static void main(String[] args) {
	
		//sum of Array 1   total having numbers 
		//Sum of Array 2   total rage of numbers
		//Array2- Array1 = Missing Number
		
		int a[] = {1,2,3,4,6,7,8,9,10};
		int sum1 =0;
		
		for(int i=0; i<a.length; i++)
		{
			sum1 = sum1+a[i];
	
		}
		System.out.println("sum of elements in Array :"+sum1);
		
		int sum2 =0;
		for(int i=1; i<=10; i++)
		{
			sum2 =sum2+i;
		}
		System.out.println("sum of elements in array :"+sum2);

		System.out.println("missing number is :"+(sum2-sum1));
	}

}

