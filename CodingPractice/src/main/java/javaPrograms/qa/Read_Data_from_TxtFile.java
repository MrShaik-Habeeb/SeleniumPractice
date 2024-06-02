package javaPrograms.qa;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_Data_from_TxtFile {

	public static void main(String[] args) throws IOException {
		
	/*	//Approch 1  using file reader/ buffer reader
		
		FileReader fr = new FileReader("F:\\shaik.txt");
		
		BufferedReader br = new BufferedReader(fr);
		String str;
		
		while((str = br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();

		*/
		
		//Approch 2 Using Scanner
		
		File file = new File("F:\\shaik.txt");
		Scanner sc = new Scanner(file);
		
	/*	while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	*/   //Approch 3
		
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		
	}

}
