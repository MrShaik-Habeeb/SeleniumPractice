package javaPrograms.qa;

import java.util.Scanner;

public class Sum_of_Digits_in_number {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num>0)
		{
			sum = sum+num%10;
			num = num/10;
			
		}
		System.out.println("sum of digits in a number :"+sum);

	}

}