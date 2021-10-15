package DataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// this method will read data from a csv file
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\Users\\Workspace\\Documents\\SDET University\\text\\accounts.csv";
		String datarow;
		
		try {
			//open file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			//read data as long as its not empty
			while ((datarow = br.readLine()) != null) {
				//parse data by commas
				String[] line = datarow.split(",");
				//add data to collection
				data.add(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String[] account : data) {
			System.out.print("[ ");
			for (String field : account) {
				System.out.print(field);
			}
			System.out.println(" ]");
		}
	}

}
