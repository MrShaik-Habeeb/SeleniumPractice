package javaPrograms.qa;



import java.util.Scanner;

public class Largest_of_three_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A first Number :");
		int a=sc.nextInt();
	
		System.out.print("Enter A Second Number :");
		int b = sc.nextInt();
		
		System.out.print("Enter A Thrid Number :");
		int c = sc.nextInt();
		
		//Aproch 1 logic
		
		if(a>b && a>c)
		{
			System.out.println(a+ "is a Largest Number");
		}
		else{
			if(b>a && b>c)
			{
				System.out.println(b+ "is a Largest Number");
			}
	
	else
	{
		System.out.println(c+" is a Largest Number");
		
	}
		}
	}

}
