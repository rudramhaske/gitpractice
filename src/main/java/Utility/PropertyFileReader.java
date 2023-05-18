package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	static Properties prop;

	public static String getBrowserName() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\Configuration\\Config.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser1");
		System.out.println(browsername);
		return browsername;

	}

	public static String getUrl() {
		String urlname = prop.getProperty("url");
		return urlname;
	}

}
