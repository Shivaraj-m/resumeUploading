package newProject.newProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fileUtils {
	public String readDataFromPropertis(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/java/naukri.txt");
		Properties pob = new Properties();
		pob.load(fis);
		return pob.getProperty(key);
		}
}
