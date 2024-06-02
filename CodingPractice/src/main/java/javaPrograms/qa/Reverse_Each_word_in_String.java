package javaPrograms.qa;


public class Reverse_Each_word_in_String {

	public static void main(String[] args) {
	
		String str = "welcome to";
		String[] words=str.split(" ");
		
		String reverseString=" ";
		
		for(String W:words)
		{
			String reverseword = " ";
		for(int i=W.length(); i>=0; i--)
		{
			reverseword = reverseword+W.charAt(i);
			
		}
		
		reverseString = reverseString + reverseword +"";
		}
		
		System.out.println(reverseString);
		
	}
	
}