package javaPrograms.qa;



public class Reverse_Each_Word_in_String_2 {

	public static void main(String[] args) {
	
		String str = "Welcome to java";
		String[] words =str.split("\\s");
		
		String reverseword = "";
		
		for(String w:words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			reverseword = reverseword + sb.toString()+"";
		}
		System.out.println(reverseword);

	}

}