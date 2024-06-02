package javaPrograms.qa;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_Data_into_textFile {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("F:\\Habeeb.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("selenium");
		bw.write("java");

		System.out.println("Finished....");
		bw.close();
	}

}
