package javaPrograms.qa;



public class Revers_String_1 {

	public static void main(String[] args) {

		// Using String concatenation operator
		
		String str = "ABCD";
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("Reverse String is :" +rev);
	}

}
