package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    Properties prop = null;

    public ReadProperties(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            System.out.println(fis);
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getPropertyValue(String key) {
        return prop.getProperty(key);
    }
}