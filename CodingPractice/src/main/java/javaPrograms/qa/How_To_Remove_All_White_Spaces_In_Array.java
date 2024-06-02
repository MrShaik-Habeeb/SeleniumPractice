package javaPrograms.qa;



public class How_To_Remove_All_White_Spaces_In_Array {

	public static void main(String[] args) {
		
		String str = "java programing language";
		
		System.out.println("Befor Remove spaces Array :"+str);
		str = str.replaceAll("\\s","");
		System.out.println("After remove Spaces in Array :"+str);
	}

}
