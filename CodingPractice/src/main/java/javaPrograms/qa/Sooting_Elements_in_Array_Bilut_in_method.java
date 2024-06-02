package javaPrograms.qa;



import java.lang.reflect.Array;
import java.util.Arrays;

public class Sooting_Elements_in_Array_Bilut_in_method {

	public static void main(String[] args) {
	
		int a[]= {30,20,10,60,40};
		
		System.out.println("Array elements before sorting :"+Arrays.toString(a));
		//Arrays.parallelSort(a);       //Approch 1
		Arrays.sort(a);					//Approch 2
		
	//	Arrays.sort(a.collections.reverseorder());
		System.out.println("Array elements After Sorting :"+Arrays.toString(a));

	}

}
