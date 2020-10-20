package org.example.Configs;

import java.util.HashMap;
import java.util.Map;

public class RequestParams
{
    protected static Map<String, String> map= new HashMap<String, String>();
    public static Map<String, String> ParamsForPostRequest()
    {
        //map.put("key", "qaclick");

        return map;
    }

    public static Map<String, String> ParamsForGetRequest(String place_id)
    {
        map.put("key", "qaclick");
        map.put("place_id", place_id);
        return map;
    }
}
