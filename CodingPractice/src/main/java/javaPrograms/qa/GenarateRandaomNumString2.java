package javaPrograms.qa;

import java.util.Random;

public class GenarateRandaomNumString2 {

	public static void main(String[] args) {
		
		  String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	        StringBuilder salt = new StringBuilder();
	        Random rnd = new Random();
	        while (salt.length() < 18) { // length of the random string.
	            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
	            salt.append(SALTCHARS.charAt(index));
	        }
	        String saltStr = salt.toString();
	        
	        System.out.println(saltStr);

}
}