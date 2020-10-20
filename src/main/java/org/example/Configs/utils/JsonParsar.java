package org.example.Configs.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParsar
{
    public static String parse(String json, String key) throws Exception
    {
        Object obj = new JSONParser().parse(json);
        JSONObject jsonObject= (JSONObject)obj;
        return (String)jsonObject.get(key);
    }
}
