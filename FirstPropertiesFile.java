package sql;

import java.io.FileInputStream;
import java.util.Properties;

public class FirstPropertiesFile {
	public static void main(String[] args) {
		
	try {
	FileInputStream fileInputStream=new FileInputStream("Test.Properties");
	Properties properties=new Properties();
	properties.load(fileInputStream);
	System.out.println("First data :"+properties.getProperty("key1"));
	System.out.println("second data :"+properties.getProperty("key2"));
	System.out.println("third data :"+properties.getProperty("key3"));
	System.out.println("Forth data :"+properties.getProperty("key4"));
	}catch(Exception e) {
		System.out.println("__________");
	}
}
}