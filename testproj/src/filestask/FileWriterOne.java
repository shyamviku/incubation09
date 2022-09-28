package filestask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileWriterOne {
public void writeIntoFile(String input) {
	try {
		File dir = new File("/home/inc9/myDir");
		dir.mkdir();
		FileWriter newFile = new FileWriter("/home/inc9/myDir/sample.txt");
		
		input = input+"\n";
		newFile.write(input);
		newFile.close();
	} catch (IOException e) {
				e.printStackTrace();
	}
}
public Properties getProperty(Properties newProp,String key,String value) {
	newProp.setProperty(key, value);
	return newProp;
}
public void writePropIntoFile(Properties prop) {
	try {
		File dir = new File("/home/inc9/myDir");
		dir.mkdir();
		FileWriter newFile = new FileWriter("/home/inc9/myDir/prop.txt");
		prop.store(newFile, "inc list");

	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
