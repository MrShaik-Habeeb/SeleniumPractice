package javaPrograms.qa;



import java.util.HashSet;

public class DuplicateElementInArray2 {

	public static void main(String[] args) {
		
		String arr[]= {"Java","c","pythan","c++","Java"};
		
		HashSet<String>langs= new HashSet();
		
		for(String l:arr)
		{
			System.out.println(langs.add(l));
		}
	}

}
