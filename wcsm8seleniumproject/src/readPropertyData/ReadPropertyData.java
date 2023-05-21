package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		// TO read the data from property file

		FileInputStream fis = new FileInputStream("./data/config.properties");// provide path of property file

		// to read the data from property ..create object for properties from java package

		Properties prop = new Properties();

		prop.load(fis);// make the property file for read

		String username = prop.getProperty("username");// key 

		//	 String usernam1 = prop.getProperty("USERNAME");//case sensitive 

		
				System.out.println(username);




	}

}
