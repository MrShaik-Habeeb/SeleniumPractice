package javaPrograms.qa;


import java.util.Scanner;

public class Reverse_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		
		int num =sc.nextInt();
		
		//Using algorithm

		int rev = 0;
		while(num!=0)
		{
		rev = rev*10 + num%10;
		num= num/10;
		}
		System.out.println("Reverse Number is :"+rev);
	}

}