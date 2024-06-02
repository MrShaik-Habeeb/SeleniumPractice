package javaPrograms.qa;


public class Max_and_Min_Element_in_Array {

	public static void main(String[] args) {
	
		int a[] = {10,20,30,40,60,90};
		int max = a[0];
		int min = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Element in Array is :"+max);
	for(int i=1; i<a.length; i++)
	{
		if(a[i]<min)
		{
		min = a[i];	
		}
	}
	System.out.println("Minimum Element is in Array is :"+min);
	}

}