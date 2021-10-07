package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {

		//1 define file path to write
		String filename = "C:\\Users\\Workspace\\Documents\\SDET University\\text\\fileToWrite.txt";
		String message = "im writting data that will be placed in a file";
		
		//2 create file in java
		File file = new File(filename);
		
		
		try {
			//3 open the file
			FileWriter fw = new FileWriter(file);
			//4 write to the file
			fw.write(message);
			//5 close the resources
			fw.close();
		} catch (IOException e) {
			System.out.println("error: could not read file: " + filename);
			
			e.printStackTrace();
		} finally {
			System.out.println("closing the file writer");
		}
			
	}

}
