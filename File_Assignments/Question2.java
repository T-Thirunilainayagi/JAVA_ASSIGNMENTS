package filesassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Question2 {
	
	public static void main(String[] args) {
		
		// creating HashMap set
		Map<String,String> countryMap= new HashMap<String,String>();
		String country = null;
		String capital = null;
		
		//creating file object for access
		File file = new File("D:\\Files\\Country.csv");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			
			while((line=br.readLine())!=null) {
				String[] countryCapValue=line.split(","); // splitting country and capital name
				countryMap.put(countryCapValue[0],countryCapValue[1]);
			}
			System.out.println(countryMap);
			fr.close();
			br.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

