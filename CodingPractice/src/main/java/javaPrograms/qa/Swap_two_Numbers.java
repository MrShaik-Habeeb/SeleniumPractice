package javaPrograms.qa;


public class Swap_two_Numbers {

	public static void main(String[] args) {

		int a=10, b=20;

		// Logic 1 Third variable
		
		int c=a;
		a=b;
		b=c;
		
		
		// Logic 2 Use + and - 
		
	a=a+b;
	b=a-b;
	a=a-b;
	

		//Logic 3  * and /
		// condition "a" and "b" value is not zero
		
		a=a*b;
		b=a/b;
		a=a/b;
		
	//Logic 4 Single Statement 
	
//	b=a+b-(a=b);
	
	//LOgic 5  bitwise XOR (^)
	
	a=a^b;
	b=a^b;
	a=a^b;
	
	
	System.out.println("Print Swap No:"+a+ " "+b);
	}

}
