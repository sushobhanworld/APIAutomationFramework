package org.example.Configs.utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileandEnv
{
    public static Map<String, String> map= new HashMap<String, String>();
    public static Properties prop= new Properties();

    public static Map<String, String> ReadFile() throws Exception {
        String enviornment = System.getProperty("env");
            if (enviornment.equalsIgnoreCase("dev")) {
                FileInputStream fismap = new FileInputStream(System.getProperty("user.dir") + "/inputs/dev.properties");
                prop.load(fismap);
                map.put("ServerURL", prop.getProperty("ServerURL"));
                map.put("PortNo", prop.getProperty("PortNo"));
                map.put("UserName", prop.getProperty("UserName"));
                map.put("Password", prop.getProperty("Password"));
                map.put("LOCALJSON", prop.getProperty("LOCALJSON"));
            } else if (enviornment.equalsIgnoreCase("qa")) {
                FileInputStream fisQA = new FileInputStream(System.getProperty("user.dir") + "/inputs/qa.properties");
                prop.load(fisQA);
                map.put("ServerURL", prop.getProperty("ServerURL"));
                map.put("PortNo", prop.getProperty("PortNo"));
                map.put("UserName", prop.getProperty("UserName"));
                map.put("Password", prop.getProperty("Password"));
            } else if (enviornment.equalsIgnoreCase("stagging")) {
                FileInputStream fisStagging = new FileInputStream(System.getProperty("user.dir") + "/inputs/stagging.properties");
                prop.load(fisStagging);
                map.put("ServerURL", prop.getProperty("ServerURL"));
                map.put("PortNo", prop.getProperty("PortNo"));
                map.put("UserName", prop.getProperty("UserName"));
                map.put("Password", prop.getProperty("Password"));
            }
        return map;
    }
}