package javaPrograms.qa;


import java.util.Scanner;

public class CountWordsinString {

	public static void main(String[] args) {
		System.out.println("Enter a Word :");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int count = 1;
		 
		for(int i=0; i<s.length()-1; i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number of Words in string :"+count);

	}

}
