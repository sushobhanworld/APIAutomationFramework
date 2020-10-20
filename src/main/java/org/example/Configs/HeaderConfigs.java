package org.example.Configs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs
{
    public Map<String, String> defaultHeaders()
    {
        Map<String, String> defaultHeadersMap= new HashMap<String, String>();
        defaultHeadersMap.put("Content-Type", "application/json");

        return defaultHeadersMap;
    }

    public Map<String, String> headersWithTokens()
    {
        Map<String, String> HeadersMap= new HashMap<String, String>();
        HeadersMap.put("Content-Type", "application/json");
        HeadersMap.put("Access_Token", "");
        HeadersMap.put("jwt_token", "");
        HeadersMap.put("Tenet_user", "test");

        return HeadersMap;
    }

}
