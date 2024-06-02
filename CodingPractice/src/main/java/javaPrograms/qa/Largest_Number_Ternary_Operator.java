package javaPrograms.qa;


import java.util.Scanner;

public class Largest_Number_Ternary_Operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A First Number :");
		int a = sc.nextInt();
		
		System.out.print("Enter A Second Number :");
		int b = sc.nextInt();
		
		System.out.print("Enter A Thrid NUmber :");
		int c = sc.nextInt();
		
		int Largest1 = a>b?a:b;
		int Largest2= c>Largest1?c:Largest1;
		
		//int Largest = c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(Largest2+" is a Number");

	}

}
