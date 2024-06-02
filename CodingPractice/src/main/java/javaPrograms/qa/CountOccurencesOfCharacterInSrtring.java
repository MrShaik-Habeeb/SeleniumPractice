package javaPrograms.qa;

public class CountOccurencesOfCharacterInSrtring {

	public static void main(String[] args) {
		
		String s = "Java programming language";
		int totalcount = s.length();
		int totalcount_afterRemove = s.replace("a","").length();
		
		int count = totalcount-totalcount_afterRemove;
		
		System.out.println("Number of a in Array :"+count);
	}

}
