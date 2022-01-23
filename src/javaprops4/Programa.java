package javaprops4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Programa {

	public static void main(String[] args) {
		
		Properties props = loadProp();
		String user = props.getProperty("user");
		String password =  props.getProperty("password");
		
		System.out.println(user);
		System.out.println(password);

	}
	
	
	public static Properties  loadProp() {
		
		Properties props = null;
		try(FileInputStream fs = new FileInputStream( "B:\\temp\\db.properties" )) {		
			props = new Properties();
			props.load(fs);
						
		}
		catch(IOException ex) {
			ex.getMessage();
		}	
		
		return props;
	}
	
	

}
