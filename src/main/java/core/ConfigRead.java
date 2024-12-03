package core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {
    private Properties properties = new Properties();
    public ConfigRead(String environment) throws IOException{
        FileInputStream fileInputStream = new FileInputStream(environment + "_config.properties");
        properties.load(fileInputStream);
    }
    public String getProperty(String key){
        return properties.getProperty(key);
    }
    public String getUrl(String environment){
        return properties.getProperty("url");
    }
    public String getEmail(String environment){
        return properties.getProperty("email");
    }
    public String getPassword(String environment){
        return properties.getProperty("password");
    }
}
