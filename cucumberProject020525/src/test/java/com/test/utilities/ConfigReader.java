package com.test.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    // static blok ile properties dosyasını yükle
    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");  // Dosyanın doğru yolunu belirtin
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration dosyası yüklenemedi!");
        }
    }

    // browser bilgisi döndüren metod
    public static String getBrowser() {
        return properties.getProperty("browser");
    }
    public static String getURL(){
        return properties.getProperty("url");
    }
    public static String getUsername(){
        return properties.getProperty("username");
    }
    public static String getPassword(){
        return properties.getProperty("password");
    }

}
