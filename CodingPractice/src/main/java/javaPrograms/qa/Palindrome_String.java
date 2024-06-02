package javaPrograms.qa;


import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Palindrome String :");
		String str =sc.next();
		
		String Org_str = str;
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		if(Org_str.equals(rev))
		{
			System.out.println(Org_str+" is Palindrome String");
	
		}
		else{
			System.out.println(Org_str+" is Not Palindrome String");
		}

	}

}