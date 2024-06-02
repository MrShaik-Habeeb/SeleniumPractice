package javaPrograms.qa;

public class ReverseString2 {


public static void main(String[] args) {

	String str = "EFGHIJKL";
	String rev = "";
	
/*	char a[] = str.toCharArray();
	 int len = a.length;
	 
	 for(int i=len-1; i>=0; i--)
	 {
		 rev =rev + a[i];
	 }
	 System.out.println("Reverse Number is :"+rev);
*/
	
	// String Buffer Class
	
	StringBuffer sb = new StringBuffer(str);
	 System.out.println("Reverse String is :"+sb.reverse());
}

}