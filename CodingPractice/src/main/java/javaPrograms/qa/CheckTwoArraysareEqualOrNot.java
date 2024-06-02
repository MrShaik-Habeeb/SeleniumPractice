package javaPrograms.qa;

import java.util.Arrays;

public class CheckTwoArraysareEqualOrNot {

	public static void main(String[] args) {
	
		int a[]={1,2,3,4,5,6,7};
		int b[]={1,2,3,4,5,6,7};
		
		boolean status = Arrays.equals(a,b);
		
		if(status==true)
		{
			System.out.println("Arrays are Equal");
		}
		else{
			System.out.println("Arrays are not Equal");
		}

	}

}
