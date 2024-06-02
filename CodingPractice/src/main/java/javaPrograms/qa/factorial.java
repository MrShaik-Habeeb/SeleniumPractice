package javaPrograms.qa;

import java.util.Scanner;

public class factorial {


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter A Number :");
int num = sc.nextInt();

long factorial = 1;
//Method 1 Using +
/*	for(int i=1; i<=num; i++)
{
	factorial = factorial*i;
} */
//Method 2 Using -
for(int i=num; i>=1;i--)
{
factorial = factorial*i;	
}
System.out.println("Factorial of a Number is :"+factorial);
}

}