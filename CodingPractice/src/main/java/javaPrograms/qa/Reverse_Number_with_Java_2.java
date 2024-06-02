package javaPrograms.qa;


import java.util.Scanner;

public class Reverse_Number_with_Java_2 {

	public static void main(String[] args) {
		
		// Using String Buffer Calss
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number :");
		int num = sc.nextInt();
		
	/*	StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		*/
		
	
		
		//Using String Builder
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		
		StringBuilder rev = sbl.reverse();
	
		System.out.println("Reverse Number is :"+rev);
	}

}
