package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadpropertyData {
	
	private void maim() throws FileNotFoundException {
		// TODO Auto-generated method stub
		  
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//read the data from property file
		
		Properties prop = new Properties();

	}

}
