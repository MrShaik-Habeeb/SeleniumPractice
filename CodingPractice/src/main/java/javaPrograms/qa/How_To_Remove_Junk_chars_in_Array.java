package javaPrograms.qa;



public class How_To_Remove_Junk_chars_in_Array {

	public static void main(String[] args) {
		
		String s = "$%#$^%#^&!6757846AFSGGHFRYUadfstfghf";
		s=s.replaceAll("[^a-zA-Z0-9]"," ");
		
		System.out.println(s);
	}

}
